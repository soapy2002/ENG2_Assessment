package uk.ac.york.eng2.subscription.cli.subscriptions;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.subscription.cli.domain.Subscriptions;
import uk.ac.york.eng2.subscription.cli.domain.Video;
import uk.ac.york.eng2.subscription.cli.dto.SubscriptionsDTO;

@Client("${subscriptions.url:`http://localhost:8082/subscriptions`}")
public interface SubscriptionsClient {
	
	@Get("/")
	public Iterable<Subscriptions> list();

	@Get("/videos")
	public Iterable<Video> videoList();


	@Get("/{username}/hashtag/{hashtag}")
	public List<Video> getNextVideosToWatch(String username, String hashtag); 

	@Put("/{username}/subscribe/{hashtag}")
	public HttpResponse<Void> subscribe(String username, String hashtag);

	@Put("/{username}/unsubscribe/{hashtag}")
	public HttpResponse<Void> unsubscribe(String username, String hashtag);


}
    
