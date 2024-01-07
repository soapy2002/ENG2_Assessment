package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="like-video", description="likes a video", mixinStandardHelpOptions = true)
public class likeVideo implements Runnable {
	@Inject
	private VideoClient client;

	//@Parameters(index="0")
	//private String title;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {

		VideoDTO videoDetails = new VideoDTO();

		videoDetails.setLikes(videoDetails.getLikes() + 1);


		HttpResponse<Void> response = client.likeVideo(id, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
