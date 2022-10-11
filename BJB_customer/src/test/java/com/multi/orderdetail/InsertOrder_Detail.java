package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_DetailDTO;
import com.multi.service.Order_DetailService;

@SpringBootTest
class InsertOrder_Detail {
	@Autowired
	Order_DetailService service;
	@Test
	void contextLoads() {
		try {
			service.register(new Order_DetailDTO(200,12,1000,2,45000,"검정","XL",null,null));
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
