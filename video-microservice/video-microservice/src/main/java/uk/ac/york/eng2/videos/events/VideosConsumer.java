package uk.ac.york.eng2.videos.events;

import java.util.Arrays;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

@KafkaListener(groupId = "videos-debug")
public class VideosConsumer {

    @Topic(VideosProducer.TOPIC_UPLOADED)
	public void uploadedVideo(@KafkaKey String title, Video video) {
		System.out.printf("Video uploaded: %s%n", title);
	}

    @Topic(VideosProducer.TOPIC_LIKED)
	public void likedVideo(@KafkaKey String eventId, @KafkaKey String title, Video video) {
        System.out.println(eventId + "Video liked:" + title + " hashtags" + Arrays.toString(video.getHashtag()));
	}

    @Topic(VideosProducer.TOPIC_DISLIKED)
	public void dislikedVideo(@KafkaKey String title, Video video) {
		System.out.println("Video liked:" + title + " hashtags" + Arrays.toString(video.getHashtag()));
	}

	@Topic(VideosProducer.TOPIC_WATCHED)
	public void watchVideo(@KafkaKey String title, Video video) {
		System.out.printf("Video watched: %s%n", title);
	}
}