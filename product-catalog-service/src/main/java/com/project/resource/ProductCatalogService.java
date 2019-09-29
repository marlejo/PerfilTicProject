package com.project.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.project.models.Product;

@RestController
@RequestMapping("/prod")
public class ProductCatalogService {
	private static String data_file_location = "../categories.txt";
	private static Gson gson = new Gson();
	
	@RequestMapping("/")
	public List<Product> getProducts(){
		List<Product> products = Arrays.asList(
				new Product("Apple", "Green Apple", "20", 200, "Grocerys", "Path"),
				new Product("Coca-Cola", "Coca-Cola Zero", "100", 1000, "Grocerys", "Path")
			);
		return products;
	}

}
