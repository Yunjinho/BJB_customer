package com.multi.purchase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.PurchaseDTO;
import com.multi.service.PurchaseService;

@SpringBootTest
class DeletePurchase {
	@Autowired
	PurchaseService service;
	@Test
	void contextLoads() {
		PurchaseDTO purchase=new PurchaseDTO(14, 123, "서울특별시", "카드", 100000, "홍길동", "123", 3, null, null, null, null);
		try {
			service.remove(purchase.getOrderid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
