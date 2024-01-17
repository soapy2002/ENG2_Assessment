package uk.ac.york.eng2.subscription.events;

import java.util.Arrays;
import java.util.Optional;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscription.domain.Subscriptions;
import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.VideoDTO;
import uk.ac.york.eng2.subscription.repositories.SubscriptionsRepository;
import uk.ac.york.eng2.subscription.repositories.VideoRepository;

@KafkaListener(groupId = "subscribe-debug")
public class SubscriptionsConsumer {

    @Inject
	SubscriptionsRepository repo;

    @Inject
	VideoRepository videoRepo;

    @Topic("video-uploaded")
	void uploadedVideo(@KafkaKey String title, String hashtags){
        String[] hashtagArray = hashtags.split(", "); 
        Optional<Video> Video = videoRepo.findByTitle(title);
        if (Video.isEmpty()) {
            Video video = new Video();

            video.setTitle(title);
            for (int i = 0; i < hashtagArray.length; i++){
		        video.setHashtag(hashtagArray[i]);
            }
		    video.setLikes(0);
            video.setDislikes(0);
            video.setViews(0);
		    videoRepo.save(video);
        
        }
    }

    @Topic("video-watched")
	void watchVideo(@KafkaKey String title, String username){
        Optional<Subscriptions> Subscriptions = repo.findByUsername(username);
        Optional<Video> Video = videoRepo.findByTitle(title);
        if (Subscriptions.isEmpty()) {
            Subscriptions subscriptions = new Subscriptions();
            Video b = Video.get();

            subscriptions.setUsername(username);
            subscriptions.setViewedVideos(title);
            b.setViewers(username);
            repo.save(subscriptions);
        }

    }


    @Topic("video-disliked")
	public void dislikedVideo(@KafkaKey String title, String[] hashtags) {
        System.out.println("Video liked:" + title + " hashtags" + Arrays.toString(hashtags));
	}

}

