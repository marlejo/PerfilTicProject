package com.project.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import org.json.simple.parser.JSONParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.project.models.Category;
import com.project.models.ListCategories;

@RestController
@RequestMapping("/Catalog")
public class CategoryCatalogService {
	
	private static String data_file_location = "../categories.txt";
	private static Gson gson = new Gson();
	
	@RequestMapping("/")
	public List<Category> getCategories(){
		List<Category> categories = Arrays.asList(
					new Category("Fruits", "Path", "Grocery"),
					new Category("Drinks", "Path", "Grocery")
				);
		return categories;
	}
	
	


}
