package com.project.models;

public class Category {
	private String name;
	private String photo;
	private String fatherCategory;
	
	public Category() {	}
	
	
	public Category(String name, String photo, String fatherCategory) {
		super();
		this.name = name;
		this.photo = photo;
		this.fatherCategory = fatherCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getFatherCategory() {
		return fatherCategory;
	}

	public void setFatherCategory(String fatherCategory) {
		this.fatherCategory = fatherCategory;
	}
	
	

}
