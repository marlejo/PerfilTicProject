package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AddCategoryServiceApplication {
	
	/*@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}*/	
	

	public static void main(String[] args) {
		SpringApplication.run(AddCategoryServiceApplication.class, args);
	}

}
