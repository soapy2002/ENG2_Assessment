package uk.ac.york.eng2.trending.cli.dto;



import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class TrendingDTO {

	private String hashtag;

	private Integer likes = 0;

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
