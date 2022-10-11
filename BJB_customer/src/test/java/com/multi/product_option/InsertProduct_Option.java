package com.multi.product_option;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Product_OptionDTO;
import com.multi.service.Product_OptionService;

@SpringBootTest
	class InsertProduct_Option {
	@Autowired
	Product_OptionService service;
	

	@Test
	void contextLoads() {

		Product_OptionDTO option = new Product_OptionDTO(1008,1004, "민트", "XXL", 50, null);
		try {
			service.register(option);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
