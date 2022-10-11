package com.multi.carts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.CartService;

@SpringBootTest
class InsertCart {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
