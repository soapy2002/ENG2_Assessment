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

    @Topic("video-uploaded")
	void uploadedVideo(@KafkaKey String title, String hashtags){
        String[] hashtagArray = hashtags.split(", "); 
        for (int i = 0; i < hashtagArray.length; i++){
            System.out.println(hashtagArray.length);
            String hashtag = hashtagArray[i];
            Optional<Trending> Trending = repo.findByHashtag(hashtag);
            if (Trending.isEmpty()) {
                Trending trend = new Trending();

		        trend.setHashtag(hashtag);
		        trend.setLikes(0);
		        repo.save(trend);
            }
        }
    }

    @Topic(TrendingStreams.TOPIC_TRENDING_BY_HOUR)
	public void trendingMetric(@KafkaKey WindowedIdentifier window, String hashtags) {
		System.out.printf("New value for key %s: %n", window);
	}

    @Topic("video-liked")
	public void likedVideo(@KafkaKey Long id, String hashtags) {
        String[] hashtagArray = hashtags.split(", "); 
        for (int i = 0; i < hashtagArray.length; i++){
            System.out.println(hashtagArray.length);
            String hashtag = hashtagArray[i];
            Optional<Trending> Trending = repo.findByHashtag(hashtag);
            Trending t = Trending.get();
            t.setLikes(t.getLikes() + 1);
            repo.update(t);
        }
        
        System.out.println("Video liked:" + id + " hashtags" + hashtags);
	}

    @Topic("video-disliked")
	public void dislikedlikedVideo(@KafkaKey Long id, String hashtags) {
        String[] hashtagArray = hashtags.split(", "); 
        for (int i = 0; i < hashtagArray.length; i++){
            System.out.println(hashtagArray.length);
            String hashtag = hashtagArray[i];
            Optional<Trending> Trending = repo.findByHashtag(hashtag);
            Trending t = Trending.get();
            t.setLikes(t.getLikes() - 1);
            repo.update(t);

        }
        
        System.out.println("Video liked:" + id + " hashtags" + hashtags);
	}


}

