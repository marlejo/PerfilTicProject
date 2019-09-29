package com.project.models;

import java.util.List;

public class ListCategories {
	private List<Category> categories;

	public ListCategories(List<Category> categories) {
		super();
		this.categories = categories;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	
	

}
