package uk.ac.york.eng2.videos.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class VideoDTO {

	private String hashtag;
	
	private String title;

	private String user;

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		hashtag = this.hashtag;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		title = this.title;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		user = this.user;
	}
	

	@Override
	public String toString() {
		return "VideoDTO [title=" + title + ", hashtag=" + hashtag + ", user=" + user + "]";
	}
}
