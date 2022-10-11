package com.multi.product_option;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.Product_OptionService;

@SpringBootTest
	class DeleteProduct_Option {
	
	@Autowired
	Product_OptionService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
