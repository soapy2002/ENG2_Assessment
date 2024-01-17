package uk.ac.york.eng2.videos.cli;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import uk.ac.york.eng2.videos.cli.users.AddUserCommand;
import uk.ac.york.eng2.videos.cli.users.DeleteUserCommand;
import uk.ac.york.eng2.videos.cli.users.GetUserCommand;
import uk.ac.york.eng2.videos.cli.users.GetUsersCommand;
import uk.ac.york.eng2.videos.cli.users.UpdateUserCommand;
import uk.ac.york.eng2.videos.cli.videos.addVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.addVideoViewerCommand;
import uk.ac.york.eng2.videos.cli.videos.deleteVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.deleteVideoViewerCommand;
import uk.ac.york.eng2.videos.cli.videos.dislikeVideo;
import uk.ac.york.eng2.videos.cli.videos.getVideoViewerCommand;
import uk.ac.york.eng2.videos.cli.videos.getVideosCommand;
import uk.ac.york.eng2.videos.cli.videos.likeVideo;
import uk.ac.york.eng2.videos.cli.videos.getVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.updateVideoCommand;
import uk.ac.york.eng2.videos.cli.videos.viewVideo;


@Command(name = "video-cli", description = "...",
        mixinStandardHelpOptions = true, 
        subcommands = { getVideosCommand.class, addVideoCommand.class, getVideoCommand.class, updateVideoCommand.class, deleteVideoCommand.class,
        	GetUsersCommand.class, GetUserCommand.class, AddUserCommand.class, UpdateUserCommand.class, DeleteUserCommand.class,
        	addVideoViewerCommand.class, getVideoViewerCommand.class, deleteVideoViewerCommand.class, likeVideo.class, dislikeVideo.class, viewVideo.class})


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
