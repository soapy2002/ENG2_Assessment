package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="dislike-video", description="dislikes a video", mixinStandardHelpOptions = true)
public class dislikeVideo implements Runnable {
	@Inject
	private VideoClient client;

	@Parameters(index="0")
	private String title;

	@Override
	public void run() {

		VideoDTO videoDetails = new VideoDTO();

		videoDetails.setLikes(videoDetails.getDislikes() + 1);


		HttpResponse<Void> response = client.dislikeVideo(title, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
