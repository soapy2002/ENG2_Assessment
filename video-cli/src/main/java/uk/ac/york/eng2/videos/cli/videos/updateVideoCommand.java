package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="update-video", description="Updates a video", mixinStandardHelpOptions = true)
public class updateVideoCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Option(names = {"-t", "--title"}, description="Title of the video")
	private String title;

	@Option(names = {"-ht", "--hashtag"}, description="video hashtags")
	private String hashtag;
	
	@Option(names = {"-u", "--user"}, description="user who uploaded video")
	private String user;

	@Inject
	private VideoClient client;

	@Override
	public void run() {
		VideoDTO videoDetails = new VideoDTO();
		if (title != null) {
			videoDetails.setTitle(title);
		}
		if (hashtag != null) {
			videoDetails.setHashtag(hashtag);
		}
		if (user != null) {
			videoDetails.setUser(user);
		}
		
		HttpResponse<Void> response = client.updateVideo(id, videoDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}
