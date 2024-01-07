package uk.ac.york.eng2.videos.cli.videos;

import picocli.CommandLine.Command;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.cli.domain.Video;


@Command(name = "get-videos", description = "gets videos", mixinStandardHelpOptions = true)
public class getVideosCommand implements Runnable {
	
	@Inject
	private VideoClient client;

	@Override
	public void run() {
		for (Video v : client.list()) {
			System.out.println(v);
		}
	}
}