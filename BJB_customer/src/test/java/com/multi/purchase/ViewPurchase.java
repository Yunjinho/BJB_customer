package com.multi.purchase;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.PurchaseDTO;
import com.multi.service.PurchaseService;

@SpringBootTest
class ViewPurchase {
	@Autowired
	PurchaseService service;
	
	@Test
	void contextLoads() {
		List<PurchaseDTO> list=null;
		try {
			list = service.viewPurchase(125);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(PurchaseDTO i:list) {
			System.out.println(i);
		}
		
	}
}
