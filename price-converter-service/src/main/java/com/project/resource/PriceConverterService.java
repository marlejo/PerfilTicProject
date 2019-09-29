package com.project.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/price")
public class PriceConverterService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String getPrice() {
		String s = restTemplate.getForObject("http://apilayer.net/api/live?"
				+ "access_key=955b7265fd9c05905231169f9c45669c&"
				+ "currencies=COP&"
				+ "source=USD&"
				+ "format=1", String.class);
		return s;
	}

}
