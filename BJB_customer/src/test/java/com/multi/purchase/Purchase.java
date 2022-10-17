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
		 try {


	    } catch (Exception e) {
	          e.printStackTrace();
	    }
	}
	}


