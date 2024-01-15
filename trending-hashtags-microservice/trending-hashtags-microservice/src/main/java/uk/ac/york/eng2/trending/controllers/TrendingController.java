package uk.ac.york.eng2.trending.controllers;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trending.domain.Book;
import uk.ac.york.eng2.trending.domain.User;
import uk.ac.york.eng2.trending.dto.BookDTO;
import uk.ac.york.eng2.trending.events.BooksProducer;
import uk.ac.york.eng2.trending.repositories.BooksRepository;
import uk.ac.york.eng2.trending.repositories.UsersRepository;

@Controller("/trending")
public class TrendingController {

	@Inject
	TrendingRepository repo;

	@Inject
	TrendingProducer producer;

	@Get("/")
	public Iterable<Trending> list() {
		return repo.findAll();
	}


}
