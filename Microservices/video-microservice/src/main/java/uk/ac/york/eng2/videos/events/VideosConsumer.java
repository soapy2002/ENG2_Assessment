package uk.ac.york.eng2.videos.events;

import java.util.Arrays;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

@KafkaListener(groupId = "videos-debug")
public class VideosConsumer {

    @Topic(VideosProducer.TOPIC_DISLIKED)
	public void dislikedVideo(@KafkaKey String title, String hashtags) {
		System.out.println("Video liked:" + title + " hashtags" + hashtags);
	}

	@Topic(VideosProducer.TOPIC_WATCHED)
	public void watchVideo(@KafkaKey String title, String username) {
		System.out.printf("Video watched: %s%n", title);
	}
}