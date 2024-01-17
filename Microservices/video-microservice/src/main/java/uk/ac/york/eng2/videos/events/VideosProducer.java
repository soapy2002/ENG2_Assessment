package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import uk.ac.york.eng2.videos.domain.Video;

@KafkaClient
public interface VideosProducer {
 
    String TOPIC_UPLOADED = "video-uploaded";

    String TOPIC_LIKED = "video-liked";

    String TOPIC_DISLIKED = "video-disliked";

	String TOPIC_WATCHED = "video-watched";

    @Topic(TOPIC_UPLOADED)
	void uploadedVideo(@KafkaKey String title, String hashtags);

    @Topic(TOPIC_LIKED)
	void likedVideo(@KafkaKey Long id, String hashtags);

    @Topic(TOPIC_DISLIKED)
	void dislikeVideo(@KafkaKey String title, String hashtags);

	@Topic(TOPIC_WATCHED)
	void watchVideo(@KafkaKey String title, String username);

}
