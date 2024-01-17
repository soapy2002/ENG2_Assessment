package uk.ac.york.eng2.subscription.domain;

import java.util.ArrayList;
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
	private ArrayList<String> hashtag = new ArrayList<String>();
	
	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private Integer views = 0;

	@Column(nullable = false)
	private Integer likes = 0;

	@Column(nullable = false)
	private Integer dislikes = 0;

	private ArrayList<String> viewers = new ArrayList<String>();
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public ArrayList<String> getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag.add(hashtag);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
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

	public ArrayList<String> getViewers() {
		return viewers;
	}

	public void setViewers(String viewers) {
		this.viewers.add(viewers);
	}
}
