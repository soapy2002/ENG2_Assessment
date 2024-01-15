package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="view-video", description="views a video", mixinStandardHelpOptions = true)
public class viewVideo implements Runnable {
	@Inject
	private VideoClient client;

	@Parameters(index="0")
	private String title;

	@Override
	public void run() {

		VideoDTO videoDetails = new VideoDTO();

		videoDetails.setLikes(videoDetails.getViews() + 1);


		HttpResponse<Void> response = client.viewVideo(title, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
