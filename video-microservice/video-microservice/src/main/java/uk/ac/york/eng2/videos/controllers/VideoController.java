package uk.ac.york.eng2.videos.controllers;


import java.net.URI;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.repositories.VideoRepository;
import uk.ac.york.eng2.videos.repositories.UserRepository;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.VideoDTO;

@Controller("/videos")
public class VideoController {
	@Inject
	VideoRepository repo;

	@Inject
	UserRepository userRepo;

	@Inject
	VideosProducer producer;
	
	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO VideoDetails) { 
		Video video = new Video();

		video.setHashtag(VideoDetails.getHashtag());
		video.setTitle(VideoDetails.getTitle());
		video.setUser(VideoDetails.getUser());
		video.setLikes(VideoDetails.getLikes());
		video.setDislikes(VideoDetails.getDislikes());
		video.setViews(VideoDetails.getViews());

		repo.save(video);

		producer.uploadedVideo(video.getTitle(), video);

		return HttpResponse.created(URI.create("/videos/" + video.getId()));
	}

	@Transactional
	@Put("/likes/{title}")
	public HttpResponse<Void> likeVideo(String title, @Body VideoDTO VideoDetails) {
	Optional<Video> Video = repo.findByTitle(title);
	if (Video.isEmpty()) {
		return HttpResponse.notFound();
	}

	Video b = Video.get();
	b.setLikes(Video.get().getLikes() + 1);
	String eventId = UUID.randomUUID().toString();

	repo.update(b);
	producer.likedVideo(eventId, title, b);
	return HttpResponse.ok();
	}

	@Transactional
	@Put("/dislikes/{title}")
	public HttpResponse<Void> dislikeVideo(String title, @Body VideoDTO VideoDetails) {
	Optional<Video> Video = repo.findByTitle(title);
	if (Video.isEmpty()) {
		return HttpResponse.notFound();
	}

	Video b = Video.get();
	b.setDislikes(Video.get().getDislikes() + 1);

	repo.update(b);
	producer.dislikeVideo(title, b);
	return HttpResponse.ok();
	}

	@Transactional
	@Put("/views/{title}")
	public HttpResponse<Void> viewVideo(String title, @Body VideoDTO VideoDetails) {
	Optional<Video> Video = repo.findByTitle(title);
	if (Video.isEmpty()) {
		return HttpResponse.notFound();
	}

	Video b = Video.get();
	producer.watchVideo(title, b);
	b.setViews(VideoDetails.getViews() + 1);

	repo.update(b);
	return HttpResponse.ok();
	}

	@Get("/{id}")
	public VideoDTO getVideo(long id) {
		return repo.findOne(id).orElse(null);
	}

	@Get("/title/{title}")
	public Video getVideoByTitle(String title) {
		return repo.findByTitle(title).orElse(null);
	}

	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateVideo(long id, @Body VideoDTO VideoDetails) {
		Optional<Video> Video = repo.findById(id);
		if (Video.isEmpty()) {
			return HttpResponse.notFound();
		}

		Video b = Video.get();
		if (VideoDetails.getTitle() != null) {
			b.setTitle(VideoDetails.getTitle());
		}
		if (VideoDetails.getHashtag() != null) {
			b.setHashtag(VideoDetails.getHashtag());
		}
		if (VideoDetails.getUser() != null) {
			b.setUser(VideoDetails.getUser());
		}
		repo.update(b);
		return HttpResponse.ok();
	}

	@Transactional
	@Delete("/{id}")
	public HttpResponse<Void> deleteVideo(long id) {
		Optional<Video> Video = repo.findById(id);
		if (Video.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(Video.get());
		return HttpResponse.ok();
	}

	@Get("/{id}/viewers")
	public Iterable<User> getViewers(long id) {
		Optional<Video> oVideo = repo.findById(id);
		if (oVideo.isEmpty()) {
			return null;
		}
		return oVideo.get().getViewers();
	}

	@Transactional
	@Put("/{VideoId}/viewers/{userId}")
	public HttpResponse<String> addViewer(String title, long userId) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", VideoId));
		}

		Optional<User> oUser = userRepo.findById(userId);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %d not found", userId));
		}

		Video Video = oVideo.get();
		Video.getViewers().add(oUser.get());
		repo.update(Video);

		return HttpResponse.ok(String.format("User %d added as viewer of Video %d", userId, VideoId));
	}

	@Transactional
	@Delete("/{VideoId}/viewers/{userId}")
	public HttpResponse<String> removeViewer(long VideoId, long userId) {
		Optional<Video> oVideo = repo.findById(VideoId);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %d not found", VideoId));
		}

		/*
		 * DELETE should be idempotent, so it's OK if the mentioned
		 * user was not a viewer of the Video.
		 */ 
		Video Video = oVideo.get();
		Video.getViewers().removeIf(u -> userId == u.getId());
		repo.update(Video);

		return HttpResponse.ok();
	}
}
