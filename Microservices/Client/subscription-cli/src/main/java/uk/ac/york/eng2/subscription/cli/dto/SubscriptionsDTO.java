package uk.ac.york.eng2.subscription.cli.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class SubscriptionsDTO {

	private Long id;

	private String username;

	private ArrayList<String> viewed;
	
	private  ArrayList<String> subscribed;

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

	public void setSubscribed(String hashtag) {
		this.subscribed.add(hashtag);
	}

	public void setUnsubscribed(String hashtag) {
		this.subscribed.remove(hashtag);
	}

	public ArrayList<String> getViewed() {
		return viewed;
	}

	public void setViewed(String title) {
		this.viewed.add(title);
	}

}
