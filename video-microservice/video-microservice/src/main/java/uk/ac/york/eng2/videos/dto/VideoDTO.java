package uk.ac.york.eng2.videos.dto;

import javax.persistence.Column;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class VideoDTO {

	@Column(nullable = false)
	private String hashtag;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
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
}
