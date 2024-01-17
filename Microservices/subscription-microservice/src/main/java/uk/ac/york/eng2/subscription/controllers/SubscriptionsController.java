package uk.ac.york.eng2.subscription.controllers;

import java.net.URI;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.domain.Subscriptions;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.events.SubscriptionsProducer;
import uk.ac.york.eng2.subscription.repositories.SubscriptionsRepository;
import uk.ac.york.eng2.subscription.repositories.VideoRepository;

@Controller("/subscriptions")
public class SubscriptionsController {

	@Inject
	SubscriptionsRepository repo;

	@Inject
	VideoRepository videoRepo;

	@Inject
	SubscriptionsProducer producer;

	@Get("/")
	public Iterable<Subscriptions> list() {
		return repo.findAll();
	}

	@Get("/videos")
	public Iterable<Video> videoList() {
		return videoRepo.findAll();
	}


	@Get("/{username}/hashtag/{hashtag}")
	public List<Video> getNextVideosToWatch(String username, String hashtag) {
		ArrayList<Video> videos = new ArrayList<Video>();
		Iterable<Video> vids = videoRepo.findAll();
		Optional<Subscriptions> Subscriptions = repo.findByUsername(username);

		Subscriptions s = Subscriptions.get();

		for (Video v : vids) {
			if (v.getHashtag().contains(hashtag) && !s.getViewed().contains(v.getTitle())){
				videos.add(v);
			}
		}
		return videos;
	}

	@Transactional
	@Put("/{username}/subscribe/{hashtag}")
	public HttpResponse<Void> subscribe(String username, String hashtag) {
		Optional<Subscriptions> Subscriptions = repo.findByUsername(username);
 
		Subscriptions s = Subscriptions.get();
		s.subscribedToHashtag(hashtag);

		repo.save(s);
		producer.subscribe(s.getId(), hashtag);

		return HttpResponse.ok();
	}

	@Transactional
	@Put("/{username}/unsubscribe/{hashtag}")
	public HttpResponse<Void> unsubscribe(String username, String hashtag) {
		Optional<Subscriptions> Subscriptions = repo.findByUsername(username);
 
		Subscriptions s = Subscriptions.get();
		s.unsubscribed(hashtag);

		repo.save(s);
		producer.unsubscribe(s.getId(), hashtag);

		return HttpResponse.ok();
	}


}
