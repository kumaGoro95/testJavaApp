package model;

import java.io.Serializable;

public class WrittenPost implements Serializable{
	private int postId;
	private String userId;
	private String text;
	private String name;
	private String icon;

	public WrittenPost() {}

	public WrittenPost(int postId, String userId, String name,String text, String icon) {
		this.postId = postId;
		this.userId = userId;
		this.name = name;
		this.text = text;
		this.icon = icon;
	}

	public int getPostId() {
		return postId;
	}
	public String getUserId() {
		return userId;
	}
	public String getText() {
		return text;
	}
	public String getName() {
		return name;
	}
	public String getIcon() {
		return icon;
	}

	 public void setPostId(int postId) {
		 this.postId = postId;
	 }
	 public void setUserId(String userId) {
		 this.userId = userId;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setText(String text) {
		 this.text = text;
	 }
	 public void setIcon(String icon) {
		 this.icon = icon;
	 }
}
