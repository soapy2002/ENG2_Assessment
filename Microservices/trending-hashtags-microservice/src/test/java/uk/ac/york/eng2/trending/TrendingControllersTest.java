package uk.ac.york.eng2.trending;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.annotation.MockBean;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.clients.TrendingClient;
import uk.ac.york.eng2.trending.domain.Trending;
import uk.ac.york.eng2.trending.dto.TrendingDTO;
import uk.ac.york.eng2.trending.events.TrendingConsumer;
import uk.ac.york.eng2.trending.repositories.TrendingRepository;

/*
 * We have to disable transactions here, as otherwise the controller will not be
 * able to see changes made by the test.
 */
@MicronautTest(transactional = false, environments = "no_streams")
public class TrendingControllersTest {

	@Inject
	TrendingClient client;

	@Inject
	TrendingRepository repo;

	@BeforeEach
	public void clean() {
		repo.deleteAll();
	}

	@Test
	public void noHashtags() {
		Iterable<Trending> iterTrend = client.list();
		assertFalse(iterTrend.iterator().hasNext(), "Service should not list any hashtags initially");
	}

	
}
