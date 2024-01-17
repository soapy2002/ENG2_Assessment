package uk.ac.york.eng2.subscription.cli.subscriptions;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Subscriptions;
import uk.ac.york.eng2.subscription.cli.domain.Video;
import uk.ac.york.eng2.subscription.cli.dto.SubscriptionsDTO;

@Command(name="unsubscribe", description="Unsubscribes", mixinStandardHelpOptions = true)
public class unsubscribeCommand implements Runnable {

	@Inject
	private SubscriptionsClient client;

	@Parameters(index = "0")
	private String username;

	@Parameters(index = "1")
	private String hashtag;

	@Override
	public void run() {
		HttpResponse<Void> response = client.unsubscribe(username, hashtag);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}
