package com.project.models;

public class Category {
	private String name;
	private String photo;
	private Category fatherCategory;
	
	public Category() {
	
	}
	
	public Category(String name, String photo, Category fatherCategory) {
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

	public Category getFatherCategory() {
		return fatherCategory;
	}

	public void setFatherCategory(Category fatherCategory) {
		this.fatherCategory = fatherCategory;
	}
	
	

}
