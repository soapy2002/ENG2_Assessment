package uk.ac.york.eng2.trending.cli.trends;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.trending.cli.domain.Trending;
import uk.ac.york.eng2.trending.cli.dto.TrendingDTO;

@Command(name="get-hashtags", description="Gets all hashtags", mixinStandardHelpOptions = true)
public class getHashtagsCommand implements Runnable {

	@Inject
	private TrendingClient client;

	@Override
	public void run() {
		for (Trending t : client.list()) {
			System.out.println(t);
		}
	}

	
}
