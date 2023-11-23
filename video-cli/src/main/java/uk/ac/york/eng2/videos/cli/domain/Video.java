package uk.ac.york.eng2.videos.cli.domain;

import io.micronaut.serde.annotation.Serdeable;


@Serdeable
public
class Video {
	private Long id;

	private String hashtag;

	private String title;
	
	private String user;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		id = this.id;
	}

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
