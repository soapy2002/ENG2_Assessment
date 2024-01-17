package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-video-viewer", description="Deletes a view from a video", mixinStandardHelpOptions = true)
public class deleteVideoViewerCommand implements Runnable {

	@Parameters(index="0")
	private Long videoId;

	@Parameters(index="1")
	private Long userId;

	@Inject
	private VideoClient client;

	@Override
	public void run() {
		HttpResponse<String> response = client.removeViewer(videoId, userId);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
	}

}
