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

	@Parameters(index="1")
	private String username;

	@Override
	public void run() {

		HttpResponse<Void> response = client.viewVideo(title, username);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
