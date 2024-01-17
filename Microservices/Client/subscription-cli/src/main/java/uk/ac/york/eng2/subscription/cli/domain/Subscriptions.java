package uk.ac.york.eng2.subscription.cli.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Subscriptions {

	private Long id;
	
	private String username;

	private ArrayList<String> viewed = new ArrayList<String>();
	
	private  ArrayList<String> subscribed = new ArrayList<String>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<String> getSubscribed() {
		return subscribed;
	}

	public void subscribedToHashtag(String hashtag) {
		this.subscribed.add(hashtag);
	}

	public void unsubscribed(String hashtag) {
		this.subscribed.remove(hashtag);
	}

	public ArrayList<String> getViewed() {
		return viewed;
	}

	public void setViewedVideos(String title) {
		this.viewed.add(title);
	}

}
