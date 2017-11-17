package com.sjsu.backbenchers.vBless.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Campaign {
	
	
	@javax.persistence.Id
	@GeneratedValue
	private Long campaignId;
	private String userId;
	private String campaignTitle;
	private String campaignDescription;
	private String blUrl;
	private String imgUrl;
	private String thumbnailUrl;
	private String createDate;
	private String suspendDate;
	private String category;
	private String duration;
	private String goal;
	private String city;
	private String country;
	private String active;
		
		
	public Campaign() {
		super();
	}

	

	public Campaign(String userId, String campaignTitle, String campaignDescription, String blUrl, String imgUrl,
			String thumbnailUrl, String createDate, String suspendDate, String category, String duration, String goal,
			String city, String country, String active) {
		super();
		this.userId = userId;
		this.campaignTitle = campaignTitle;
		this.campaignDescription = campaignDescription;
		this.blUrl = blUrl;
		this.imgUrl = imgUrl;
		this.thumbnailUrl = thumbnailUrl;
		this.createDate = createDate;
		this.suspendDate = suspendDate;
		this.category = category;
		this.duration = duration;
		this.goal = goal;
		this.city = city;
		this.country = country;
		this.active = active;
	}



	public Long getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getCampaignTitle() {
		return campaignTitle;
	}


	public void setCampaignTitle(String campaignTitle) {
		this.campaignTitle = campaignTitle;
	}


	public String getCampaignDescription() {
		return campaignDescription;
	}


	public void setCampaignDescription(String campaignDescription) {
		this.campaignDescription = campaignDescription;
	}


	public String getBlUrl() {
		return blUrl;
	}


	public void setBlUrl(String blUrl) {
		this.blUrl = blUrl;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getThumbnailUrl() {
		return thumbnailUrl;
	}


	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}


	public String getCreateDate() {
		return createDate;
	}


	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}


	public String getSuspendDate() {
		return suspendDate;
	}


	public void setSuspendDate(String suspendDate) {
		this.suspendDate = suspendDate;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getGoal() {
		return goal;
	}


	public void setGoal(String goal) {
		this.goal = goal;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}
	
	
}