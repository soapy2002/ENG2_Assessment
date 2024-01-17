package uk.ac.york.eng2.subscription.cli.subscriptions;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Subscriptions;
import uk.ac.york.eng2.subscription.cli.domain.Video;
import uk.ac.york.eng2.subscription.cli.dto.SubscriptionsDTO;

@Command(name="get-next-video", description="Gets next videos to watch", mixinStandardHelpOptions = true)
public class getNextVideoCommand implements Runnable {

	@Inject
	private SubscriptionsClient client;

	@Parameters(index = "0")
	private String username;

	@Parameters(index = "1")
	private String hashtag;

	@Override
	public void run() {
		for (Video s : client.getNextVideosToWatch(username, hashtag)) {
			System.out.println(s.getTitle());
		}
	}

	
}
