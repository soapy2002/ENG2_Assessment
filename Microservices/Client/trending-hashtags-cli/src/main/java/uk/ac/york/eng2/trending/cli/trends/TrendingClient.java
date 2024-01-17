package uk.ac.york.eng2.trending.cli.trends;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.trending.cli.domain.Trending;
import uk.ac.york.eng2.trending.cli.dto.TrendingDTO;

@Client("${videos.url:`http://localhost:8081/trending`}")
public interface TrendingClient {
	
	@Get("/")
	Iterable<Trending> list();
	
	@Get("/top10")
	List<Trending> topTenHashtags();


}
    
