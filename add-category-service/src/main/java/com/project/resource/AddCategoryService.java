package com.project.resource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.project.models.Category;

@RestController
@RequestMapping("/cat")
public class AddCategoryService {
	
	private static String data_file_location = "./category.txt";
	private static Gson gson = new Gson();
	
	@RequestMapping("/{categoryName}")
	public Category addCategory(@PathVariable("categoryName")String name,String imgPath) {
		Category category = new Category();
		category.setName(name);
		category.setPhoto("path");
		categoryWriteToFile(gson.toJson(category));
		return category;
	}
	
	private void categoryWriteToFile(String myData) {
		File categoryFile = new File(data_file_location);
		if (!categoryFile.exists()) {
			try {
				File directory = new File(categoryFile.getParent());
				if (!directory.exists()) {
					directory.mkdirs();
				}
				categoryFile.createNewFile();
			} catch (IOException e) {
				System.out.println("Excepton Occured: " + e.toString());
			}
		}
 
		try {
			// Convenience class for writing character files
			FileWriter dataWriter;
			dataWriter = new FileWriter(categoryFile.getAbsoluteFile(), true);
 
			// Writes text to a character-output stream
			BufferedWriter bufferWriter = new BufferedWriter(dataWriter);
			bufferWriter.write(myData.toString());
			bufferWriter.close();
 
			System.out.println("Company data saved at file location: " + data_file_location + " Data: " + myData + "\n");
		} catch (IOException e) {
			System.out.println("Hmm.. Got an error while saving Company data to file " + e.toString());
		}
	}

}
