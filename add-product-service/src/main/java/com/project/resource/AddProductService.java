package com.project.resource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.html.parser.ParserDelegator;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.project.models.Product;

@RestController
@RequestMapping("/prod")
public class AddProductService {
	private static String data_file_location = "../products.txt";
	private static Gson gson = new Gson();
	
	@RequestMapping("/{productData}")
	public Product addProduct(@PathVariable("productData")String productData) {
		String[] data = productData.split("-"); 
		if(data.length==6) {
			Product product = new Product();
			product.setName(data[0]);
			product.setDesc(data[1]);
			product.setWeight(data[2]);
			product.setPrice(Double.parseDouble( data[3]));
			product.setCategory(data[4]);
			product.setPhoto(data[5]);
			WriteToFile(gson.toJson(product));
			return product;
		}else if (data.length==5) {
			Product product = new Product();
			product.setName(data[0]);
			product.setDesc(data[1]);
			product.setWeight(data[2]);
			product.setPrice(Double.parseDouble( data[3]));
			product.setCategory(data[4]);
			WriteToFile(gson.toJson(product));
			return product;
		}else if (data.length==4) {
			Product product = new Product();
			product.setName(data[0]);
			product.setDesc(data[1]);
			product.setWeight(data[2]);
			product.setPrice(Double.parseDouble( data[3]));
			WriteToFile(gson.toJson(product));
			return product;
		}
		//return "URI should look like this:	/prod/prodName-prodDesc-prodWeirgt-prodPrice-prodCategory-prodPhoto or 
		//										/prod/prodName-prodDesc-prodWeirgt-prodPrice-prodCategory
		//										/prod/prodName-prodDesc-prodWeirgt-prodPrice
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
 
			System.out.println("data saved at file location: " + data_file_location + " Data: " + myData + "\n");
		} catch (IOException e) {
			System.out.println("Hmm.. Got an error while saving Company data to file " + e.toString());
		}
	}

}
