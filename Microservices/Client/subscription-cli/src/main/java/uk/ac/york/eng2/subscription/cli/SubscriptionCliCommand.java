package uk.ac.york.eng2.subscription.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscription.cli.subscriptions.getNextVideoCommand;
import uk.ac.york.eng2.subscription.cli.subscriptions.getSubscriptionsCommand;
import uk.ac.york.eng2.subscription.cli.subscriptions.subscribeCommand;
import uk.ac.york.eng2.subscription.cli.subscriptions.unsubscribeCommand;

@Command(name = "subscription-cli", description = "...",
        mixinStandardHelpOptions = true, subcommands = {getNextVideoCommand.class, subscribeCommand.class, unsubscribeCommand.class, getSubscriptionsCommand.class})
public class SubscriptionCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(SubscriptionCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
