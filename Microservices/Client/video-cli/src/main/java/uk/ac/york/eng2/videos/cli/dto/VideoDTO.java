package uk.ac.york.eng2.videos.cli.dto;

import java.util.Set;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.cli.domain.User;

@Serdeable
public class VideoDTO {

	private String hashtag;
	
	private String title;

	private String user;

	private Integer views = 0;

	private Integer likes = 0;

	private Integer dislikes = 0;

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
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
	
	@Override
	public String toString() {
		return "VideoDTO [title=" + title + ", hashtag=" + hashtag + ", user=" + user + ", likes=" + likes + ", dislikes=" + dislikes + ", views" + views + "]";
	}
}
