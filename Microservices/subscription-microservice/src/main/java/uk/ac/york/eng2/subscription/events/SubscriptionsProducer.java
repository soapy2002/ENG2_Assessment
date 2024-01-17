package uk.ac.york.eng2.subscription.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface SubscriptionsProducer {

	String TOPIC_SUBSCRIBE = "subscribe";

	String TOPIC_UNSUBSCRIBE = "unsubscribe";

	@Topic(TOPIC_SUBSCRIBE)
	void subscribe(@KafkaKey Long id, String hashtag);

	@Topic(TOPIC_UNSUBSCRIBE)
	void unsubscribe(@KafkaKey Long id, String hashtag);
}