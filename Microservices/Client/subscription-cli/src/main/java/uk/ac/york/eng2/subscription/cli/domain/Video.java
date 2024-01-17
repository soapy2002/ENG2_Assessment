package uk.ac.york.eng2.subscription.cli.domain;

import java.util.ArrayList;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public
class Video {

	private Long id;
	
	private ArrayList<String> hashtag = new ArrayList<String>();

	private String title;

	private Integer views = 0;

	private Integer likes = 0;

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
