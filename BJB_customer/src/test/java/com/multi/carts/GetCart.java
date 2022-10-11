package com.multi.carts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class GetCart {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO carts=null;
		try {
			service.get(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(carts);
	}
}
