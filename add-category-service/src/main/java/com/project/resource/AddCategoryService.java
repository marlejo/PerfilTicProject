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
	
	private static String data_file_location = "../categories.txt";
	private static Gson gson = new Gson();
	
	@RequestMapping("/{categoryAdd}")
	public Category addCategory(@PathVariable("categoryAdd")String categoryData) {
		String[] data = categoryData.split("-"); 
		if(data.length==3) {
			Category category = new Category();
			category.setName(data[0]);
			category.setPhoto(data[1]);
			category.setFatherCategory(data[2]);
			WriteToFile(gson.toJson(category));
			return category;
		}else if (data.length==2) {
			Category category = new Category();
			category.setName(data[0]);
			category.setPhoto(data[1]);
			WriteToFile(gson.toJson(category));
			return category;
		}
		//return "URI should look like this: /cat/categoryName-categoryPhoto-categoryFather or /cat/categoryName-categoryPhoto";
		return null;
	}
	
	private void WriteToFile(String myData) {
		File file = new File(data_file_location);
		if (!file.exists()) {
			try {
				File directory = new File(file.getParent());
				if (!directory.exists()) {
					directory.mkdirs();
				}
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("Excepton Occured: " + e.toString());
			}
		}
 
		try {
			// Convenience class for writing character files
			FileWriter dataWriter;
			dataWriter = new FileWriter(file.getAbsoluteFile(), true);
 
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
