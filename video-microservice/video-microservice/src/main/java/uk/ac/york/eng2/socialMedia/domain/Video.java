package uk.ac.york.eng2.socialMedia.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public
class Video {
	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String hashtag;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
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
