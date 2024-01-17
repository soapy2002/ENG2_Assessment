package uk.ac.york.eng2.trending.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.trending.cli.trends.getHashtagsCommand;
import uk.ac.york.eng2.trending.cli.trends.getTop10HashtagsCommand;

@Command(name = "trending-hashtags-cli", description = "...",
        mixinStandardHelpOptions = true,
        subcommands = {getHashtagsCommand.class, getTop10HashtagsCommand.class })
public class TrendingHashtagsCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(TrendingHashtagsCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
