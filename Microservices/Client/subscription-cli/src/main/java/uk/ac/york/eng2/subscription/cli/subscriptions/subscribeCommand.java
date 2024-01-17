package uk.ac.york.eng2.subscription.cli.subscriptions;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Subscriptions;
import uk.ac.york.eng2.subscription.cli.domain.Video;
import uk.ac.york.eng2.subscription.cli.dto.SubscriptionsDTO;

@Command(name="subscribe", description="Subscribes", mixinStandardHelpOptions = true)
public class subscribeCommand implements Runnable {

	@Inject
	private SubscriptionsClient client;

	@Parameters(index = "0")
	private String username;

	@Parameters(index = "1")
	private String hashtag;

	@Override
	public void run() {
		HttpResponse<Void> response = client.subscribe(username, hashtag);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}
