package com.multi.delivery;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DeliveryDTO;
import com.multi.service.DeliveryService;

@SpringBootTest
class InsertDelivery {
	@Autowired
	DeliveryService service;
	
	@Test
	void contextLoads() {
		DeliveryDTO delivery=new DeliveryDTO(0, 12, "배송 준비");
		try {
			service.register(delivery);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
