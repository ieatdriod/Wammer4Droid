package com.waveface.pojo;

import java.util.ArrayList;



public class ArticlePOJO {

	private String id;
	private String creator_id;
	private String creation_device_name;
	private String timestamp;
	private String text;
	private int comment_count;
	private ArrayList<FilePOJO> files;
	private ArrayList<CommentPOJO> comments;
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
	public int getComment_count() {
		return comment_count;
	}
	public void setComment_count(int comment_count) {
		this.comment_count = comment_count;
	}
	public ArrayList<FilePOJO> getFiles() {
		return files;
	}
	public void setFiles(ArrayList<FilePOJO> files) {
		this.files = files;
	}
	public ArrayList<CommentPOJO> getComments() {
		return comments;
	}
	public void setComments(ArrayList<CommentPOJO> comments) {
		this.comments = comments;
	}
}
