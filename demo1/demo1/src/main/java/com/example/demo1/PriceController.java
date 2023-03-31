package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class PriceController {
	
	
	@Autowired
	private PriceRepository  priceRepository;
	
	@RequestMapping(path = "save" , method = RequestMethod.POST)
	public Price save(@RequestBody Price price)
	{
		priceRepository.save(price);
		return price;
		
	}
	
	

}
