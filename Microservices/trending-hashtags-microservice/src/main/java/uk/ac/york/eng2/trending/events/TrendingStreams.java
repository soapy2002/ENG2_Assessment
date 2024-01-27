package uk.ac.york.eng2.trending.events;

import java.time.Duration;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Grouped;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.kafka.streams.kstream.TimeWindows;

import io.micronaut.configuration.kafka.serde.SerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import uk.ac.york.eng2.trending.domain.Trending;

@Factory
public class TrendingStreams {

	public static final String TOPIC_TRENDING_BY_HOUR = "trending-by-hour";

	@Inject
	private SerdeRegistry serdeRegistry;

	@Singleton
	public KStream<WindowedIdentifier, Long> trendingByDay(ConfiguredStreamBuilder builder) {
		Properties props = builder.getConfiguration();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, "trending-metrics");

		/*
		 * This makes the stream more predictable, and also has the side effect of reducing
		 * Kafka Streams' commit interval to 100ms (rather than the default of 30s, which
		 *  would significantly slow down our tests).
		 */
		props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE);

		KStream<Long, String> trendingStream = builder
			.stream("video-liked", Consumed.with(Serdes.Long(), Serdes.String()));

		KStream<WindowedIdentifier, Long> stream = trendingStream.groupByKey(Grouped.with(Serdes.Long(), Serdes.String()))
			.windowedBy(TimeWindows.of(Duration.ofHours(1)).advanceBy(Duration.ofHours(1)))
			.count(Materialized.as("trending-by-hour"))
			.toStream()
			.selectKey((k, v) -> new WindowedIdentifier(k.key(), k.window().start(), k.window().end()));

		stream.to(TOPIC_TRENDING_BY_HOUR,
			Produced.with(serdeRegistry.getSerde(WindowedIdentifier.class), Serdes.Long()));

		return stream;
	}

}
