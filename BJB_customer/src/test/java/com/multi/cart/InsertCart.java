package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class InsertCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		try {
			service.register(new CartDTO(0, "qkrgPwjd1541", 1000, 1, null, null, 0, 0, null, 0, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}




