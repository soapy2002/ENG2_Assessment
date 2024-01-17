package uk.ac.york.eng2.trending.controllers;

import java.net.URI;
import java.util.Optional;
import java.util.List;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.domain.Trending;
import uk.ac.york.eng2.trending.repositories.TrendingRepository;

@Controller("/trending")
public class TrendingController {

	@Inject
	TrendingRepository repo;

	@Get("/")
	public Iterable<Trending> list() {
		return repo.findAll();
	}
	
	@Get("/top10")
    public List<Trending> topTenHashtags() {
        return repo.findTop10OrderByLikesDesc();
    }
	
}
