package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Command(name="add-video", description="Adds a video", mixinStandardHelpOptions = true)
public class addVideoCommand implements Runnable {
	@Inject
	private VideoClient client;

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private String hashtag;
	
	@Parameters(index="2")
	private String user;

	@Override
	public void run() {
		VideoDTO dto = new VideoDTO();
		dto.setTitle(title);
		dto.setHashtag(hashtag);
		dto.setUser(user);
		dto.setLikes(0);
		dto.setDislikes(0);
		dto.setViews(0);

		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}
}
