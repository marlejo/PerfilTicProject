package com.project.models;

public class Product {
	private String name;
	private String Desc;
	private String weight;
	private double price;
	private String Category;
	private String photo;
	public Product(String name, String desc, String weight, double price, String category, String photo) {
		super();
		this.name = name;
		Desc = desc;
		this.weight = weight;
		this.price = price;
		Category = category;
		this.photo = photo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
