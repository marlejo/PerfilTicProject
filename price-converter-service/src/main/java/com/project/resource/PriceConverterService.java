package com.project.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/price")
public class PriceConverterService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{amountCOP}")
	public Double getPrice(@PathVariable("amountCOP")Double amountCOP) {
		String s = restTemplate.getForObject("http://apilayer.net/api/live?"
				+ "access_key=955b7265fd9c05905231169f9c45669c&"
				+ "currencies=COP&"
				+ "source=USD&"
				+ "format=1", String.class);
		String[] parts=s.split("USDCOP");
		parts[1]=parts[1].replace("}", "");
		parts[1]=parts[1].replace("\"", "");
		parts[1]=parts[1].replace(":", "");
		//System.out.println(parts[1]);
		
		return Double.parseDouble(parts[1])*amountCOP;
	}

}
