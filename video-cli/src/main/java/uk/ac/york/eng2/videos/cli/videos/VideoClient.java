package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideoClient {
	
	@Get("/")
	Iterable<Video> list();

	@Post("/")
	HttpResponse<Void> add(@Body VideoDTO videoDetails);
	
	@Get("/{id}")
	VideoDTO getVideo(long id);

	@Put("/{id}")
	HttpResponse<Void> likeVideo(Long id, @Body VideoDTO videoDetails);

	@Put("/{id}")
	HttpResponse<Void> updateVideo(long id, @Body VideoDTO videoDetails);

	@Delete("/{id}")
	HttpResponse<Void> deleteVideo(long id);

	@Get("/{id}/viewers")
	public Iterable<User> getViewers(long id);

	@Put("/{videoId}/viewers/{userId}")
	public HttpResponse<String> addViewer(long videoId, long userId);	

	@Delete("/{videoId}/viewers/{userId}")
	public HttpResponse<String> removeViewer(long videoId, long userId);

}
    
