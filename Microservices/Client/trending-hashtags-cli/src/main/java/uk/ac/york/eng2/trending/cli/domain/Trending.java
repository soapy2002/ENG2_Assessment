package uk.ac.york.eng2.trending.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Trending {

	private Long id;

	private String hashtag;

	private Integer likes = 0;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	
	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}



}
