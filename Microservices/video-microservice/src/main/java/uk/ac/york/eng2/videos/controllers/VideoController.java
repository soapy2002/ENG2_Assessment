package uk.ac.york.eng2.videos.controllers;


import java.net.URI;
import java.util.Optional;
import java.util.Set;
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
		video.setViewers(VideoDetails.getViewers());

		repo.save(video);

		producer.uploadedVideo(video.getTitle(), video.getHashtag());

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

		repo.update(b);
		producer.likedVideo(b.getId(), b.getHashtag());
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
		producer.dislikeVideo(title, b.getHashtag());
		return HttpResponse.ok();
		}

	@Transactional
	@Put("/views/{title}")
	public HttpResponse<Void> viewVideo(String title, String username) {
		Optional<Video> Video = repo.findByTitle(title);
		Optional<User> User = userRepo.findByUsername(username);
		if (Video.isEmpty()) {
			return HttpResponse.notFound();
		}

		if (!User.isPresent()) {
			User user = new User();

		    user.setUsername(username);
		    userRepo.save(user);
			Video b = Video.get();
			Set<User> viewers = b.getViewers();
			viewers.add(user);
			b.setViewers(viewers);
			b.setViews(Video.get().getViews() + 1);

			repo.update(b);
			producer.watchVideo(title, username);
		}

		else{

			Video b = Video.get();
			User u = User.get();
			Set<User> viewers = b.getViewers();
			viewers.add(u);
			b.setViewers(viewers);
			b.setViews(Video.get().getViews() + 1);

			repo.update(b);
			producer.watchVideo(title, username);
		}
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

}
