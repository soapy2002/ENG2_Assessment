package uk.ac.york.eng2.trending.events;

import java.util.Arrays;
import java.util.Optional;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.domain.Trending;
import uk.ac.york.eng2.trending.repositories.TrendingRepository;

@KafkaListener(groupId = "videos-debug")
public class TrendingConsumer {

    @Inject
	TrendingRepository repo;

    @Topic("video-liked")
	public void likedVideo(@KafkaKey String title, String[] hashtags) {
        for (int i = 0; i < hashtags.length; i++){
            String hashtag = hashtags[i];
            Optional<Trending> Trending = repo.findByHashtag(hashtag);
            if (!Trending.isPresent()) {
                Trending trend = new Trending();

		        trend.setHashtag(hashtag);
		        trend.setLikes(1);
		        repo.save(trend);
            }
            else{
                Trending t = Trending.get();
                t.setLikes(t.getLikes() + 1);
                repo.update(t);
            }
        }
        
        System.out.println("Video liked:" + title + " hashtags" + Arrays.toString(hashtags));
	}

    @Topic("video-disliked")
	public void dislikedVideo(@KafkaKey String title, String[] hashtags) {
        System.out.println("Video liked:" + title + " hashtags" + Arrays.toString(hashtags));
	}

}

