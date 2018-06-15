package com.example.reviewsite;

public class Review {
	
	private long foodID;
	private String title;
	private String imgUrl;
	private String category;
	private String content;
	public Review(long foodID, String title, String imgUrl, String category, String content) {
		super();
		this.foodID = foodID;
		this.title = title;
		this.imgUrl = imgUrl;
		this.category = category;
		this.content = content;
	}
	public long getFoodID() {
		return foodID;
	}
	public String getTitle() {
		return title;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getCategory() {
		return category;
	}
	public String getContent() {
		return content;
	}
	
	

}
