package com.multi.purchase;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.PurchaseDTO;
import com.multi.service.PurchaseService;

@SpringBootTest
class GetPurchase {
	@Autowired
	PurchaseService service;
	
	@Test
	void contextLoads() {

		PurchaseDTO purchase=null;
		try {
			purchase=service.get(10);
			System.out.println(purchase);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
