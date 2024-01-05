package uk.ac.york.eng2.videos.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.videos.cli.videos.addVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.getVideosCommand;
import io.micronaut.context.ApplicationContext;
import picocli.CommandLine;
import picocli.CommandLine.Parameters;

@Command(name = "video-cli", description = "...",
        mixinStandardHelpOptions = true, 
        subcommands = { getVideosCommand.class, addVideoCommand.class })


public class VideoCliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(VideoCliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }
    }
}
