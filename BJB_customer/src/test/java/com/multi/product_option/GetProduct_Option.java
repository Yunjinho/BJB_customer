package com.multi.product_option;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Product_OptionDTO;
import com.multi.service.Product_OptionService;

@SpringBootTest
	class GetProduct_Option {
	
	@Autowired
	Product_OptionService service;
	
	@Test
	void contextLoads() {
		Product_OptionDTO option = null;
		try {
			option = service.get(1001);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(option);
		
	}

}
