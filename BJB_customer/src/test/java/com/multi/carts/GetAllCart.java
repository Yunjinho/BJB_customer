package com.multi.carts;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class GetAllCart {
	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		List<CartDTO> list=null;
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(CartDTO i:list) {
			System.out.println(i);
		}
		
	}
}
