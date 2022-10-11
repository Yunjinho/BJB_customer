package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.Order_DetailService;

@SpringBootTest
class DeleteOrder_Detail {
	
	@Autowired
	Order_DetailService service;
	
	@Test
	void contextLoads() {
	try {
		service.remove(100);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	}
}
