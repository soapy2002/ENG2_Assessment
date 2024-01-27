package uk.ac.york.eng2.videos;

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
import uk.ac.york.eng2.videos.clients.VideoClient;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.repositories.VideoRepository;
import uk.ac.york.eng2.videos.repositories.UserRepository;

/*
 * We have to disable transactions here, as otherwise the controller will not be
 * able to see changes made by the test.
 */
@MicronautTest(transactional = false, environments = "no_streams")
public class VideoControllersTest {

	@Inject
	VideoClient client;

	@Inject
	VideoRepository repo;

	@Inject
	UserRepository userRepo;

	@BeforeEach
	public void clean() {
		repo.deleteAll();
		userRepo.deleteAll();
	}

	@Test
	public void noVideos() {
		Iterable<Video> iterVideos = client.list();
		assertFalse(iterVideos.iterator().hasNext(), "Service should not list any videos initially");
	}

	@Test
	public void addVideo() {
		final String videoTitle = "Container Security";
		final String hashtags = "a, b, c";
		final String user = "Beth123";

		VideoDTO video = new VideoDTO();
		video.setTitle(videoTitle);
		video.setHashtag(hashtags);
		video.setUser(user);
		video.setLikes(0);
		video.setDislikes(0);
		video.setViews(0);
		
		HttpResponse<Void> response = client.add(video);
		assertEquals(HttpStatus.CREATED, response.getStatus(), "Update should be successful");

		List<Video> videos = iterableToList(client.list());
		assertEquals(1, videos.size());
		assertEquals(videoTitle, videos.get(0).getTitle());
		assertEquals(hashtags, videos.get(0).getHashtag());
		assertEquals(user, videos.get(0).getUser());
	}

	@Test
	public void getVideo() {
		Video b = new Video();
		b.setTitle("Container Security");
		b.setHashtag("a, b, c");
		b.setUser("Beth123");
		b.setLikes(0);
		b.setDislikes(0);
		b.setViews(0);
		repo.save(b);

		VideoDTO videoDTO = client.getVideo(b.getId());
		assertEquals(b.getTitle(), videoDTO.getTitle(), "Title should be fetched correctly");
		assertEquals(b.getHashtag(), videoDTO.getHashtag(), "Hashtags should be fetched correctly");
		assertEquals(b.getUser(), videoDTO.getUser(), "User should be fetched correctly");
	}

	@Test
	public void getMissingVideo() {
		VideoDTO response = client.getVideo(0);
		assertNull(response, "A missing Video should produce a 404");
	}

	@Test
	public void updateVideo() {
		Video b = new Video();
		b.setTitle("Container Security");
		b.setHashtag("a, b, c");
		b.setUser("Beth123");
		b.setLikes(0);
		b.setDislikes(0);
		b.setViews(0);
		repo.save(b);

		final String newTitle = "New Title";
		VideoDTO dtoTitle = new VideoDTO();
		dtoTitle.setTitle(newTitle);
		HttpResponse<Void> response = client.updateVideo(b.getId(), dtoTitle);
		assertEquals(HttpStatus.OK, response.getStatus());

		b = repo.findById(b.getId()).get();
		assertEquals(newTitle, b.getTitle());
	}

	@Test
	public void deleteVideo() {
		Video b = new Video();
		b.setTitle("Container Security");
		b.setHashtag("a, b, c");
		b.setUser("Beth123");
		b.setLikes(0);
		b.setDislikes(0);
		b.setViews(0);
		repo.save(b);

		HttpResponse<Void> response = client.deleteVideo(b.getId());
		assertEquals(HttpStatus.OK, response.getStatus());
		
		assertFalse(repo.existsById(b.getId()));
	}


	private <T> List<T> iterableToList(Iterable<T> iterable) {
		List<T> l = new ArrayList<>();
		iterable.forEach(l::add);
		return l;
	}
}
