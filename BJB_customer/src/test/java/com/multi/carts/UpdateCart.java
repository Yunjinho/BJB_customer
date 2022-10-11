package com.multi.carts;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class UpdateCart {
	@Autowired
	CartService service;
	Date date=new Date();
	
	@Test
	void contextLoads() {
		CartDTO item=new CartDTO();
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
