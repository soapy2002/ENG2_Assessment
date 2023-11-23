package uk.ac.york.eng2.videos.cli;

import picocli.CommandLine.Command;
import jakarta.inject.Inject;
import uk.ac.york.eng2.books.cli.domain.Video;


@Command(name = "get-videos", description = "gets videos",
        mixinStandardHelpOptions = true)

public class GetVideosCommand implements Runnable {
	
	@Inject
	private VideoClient client;

	@Override
	public void run() {
		for (Video i : client.list()) {
			System.out.println(b);
		}
	}
}