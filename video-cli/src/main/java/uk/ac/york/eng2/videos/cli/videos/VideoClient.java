package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideoClient {
	
	@Get("/")
	public Iterable<Video> list();

	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails);

}
    
