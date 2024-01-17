package uk.ac.york.eng2.subscription.cli.subscriptions;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.domain.Subscriptions;
import uk.ac.york.eng2.subscription.cli.dto.SubscriptionsDTO;

@Command(name="get-subscriptions", description="Gets all subscriptions", mixinStandardHelpOptions = true)
public class getSubscriptionsCommand implements Runnable {

	@Inject
	private SubscriptionsClient client;

	@Override
	public void run() {
		for (Subscriptions s : client.list()) {
			System.out.println(s);
		}
	}

	
}
