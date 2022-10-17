package com.multi.purchase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_DetailDTO;
import com.multi.dto.PurchaseDTO;
import com.multi.service.Order_DetailService;
import com.multi.service.PurchaseService;

@SpringBootTest
class Purchase {

	
	@Autowired
	PurchaseService purchaseservice;
	@Autowired
	Order_DetailService order_detailservice;
	
	@Test
	void contextLoads() {
		PurchaseDTO purchase = new PurchaseDTO(0, "wh467925", "서울 관악구 관천로24길 19,302", "card", 215000, "김다솜", "01098797725", 5,null, null, null, null);
		 try {
	           purchaseservice.register(purchase);
	           int r = purchase.getOrderid();
	           System.out.println("Register OK"+r);
	           Order_DetailDTO detail = new Order_DetailDTO(0,r, 1019, 1, 59000, "red", "L", null, null);

	           order_detailservice.register(detail);

	    } catch (Exception e) {
	          e.printStackTrace();
	    }
	}
	}


