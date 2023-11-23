package uk.ac.york.eng2.socialMedia.controllers;


import java.net.URI;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import uk.ac.york.eng2.socialMedia.repositories.VideoRepository;
import uk.ac.york.eng2.socialMedia.domain.Video;
import uk.ac.york.eng2.socialMedia.dto.VideoDTO;

@Controller("/socialMedia")
public class VideoController {
	@Inject
	VideoRepository repo;
	
	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails) { 
		Video video = new Video();

		video.setHashtag(videoDetails.getHashtag());
		video.setTitle(videoDetails.getTitle());
		video.setUser(videoDetails.getUser());

		repo.save(video);

		return HttpResponse.created(URI.create("/Videos/" + video.getId()));

	}
}
