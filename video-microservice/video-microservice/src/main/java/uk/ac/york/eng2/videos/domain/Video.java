package uk.ac.york.eng2.videos.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	@JsonIgnore
	@ManyToMany
	private Set<User> viewers;
	
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

	public Set<User> getViewers() {
		return viewers;
	}

	public void setViewers(Set<User> viewers) {
		this.viewers = viewers;
	}
}
