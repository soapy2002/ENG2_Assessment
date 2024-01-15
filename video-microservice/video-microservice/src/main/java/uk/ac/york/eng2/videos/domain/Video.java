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
	private String[] hashtag;
	
	@Column(nullable = false)
	private String title;
	
	@Column(nullable = false)
	private String user;

	@Column(nullable = false)
	private Integer views = 0;

	@Column(nullable = false)
	private Integer likes = 0;

	@Column(nullable = false)
	private Integer dislikes = 0;

	@JsonIgnore
	@ManyToMany
	private Set<User> viewers;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String[] getHashtag() {
		return hashtag;
	}

	public void setHashtag(String[] hashtag) {
		this.hashtag = hashtag;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}

	public Set<User> getViewers() {
		return viewers;
	}

	public void setViewers(Set<User> viewers) {
		this.viewers = viewers;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getDislikes() {
		return dislikes;
	}

	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}
}
