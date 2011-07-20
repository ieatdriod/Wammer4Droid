package com.waveface.pojo;

public class CommentPOJO {
	private String id;
	private String creator_id;
	private String creation_device_name;
	private String article_id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	public String getCreation_device_name() {
		return creation_device_name;
	}
	public void setCreation_device_name(String creation_device_name) {
		this.creation_device_name = creation_device_name;
	}
	public String getArticle_id() {
		return article_id;
	}
	public void setArticle_id(String article_id) {
		this.article_id = article_id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	private String timestamp;
	private String text;
	
}
