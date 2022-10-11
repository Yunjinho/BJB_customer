package com.multi.delivery;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DeliveryDTO;
import com.multi.service.DeliveryService;

@SpringBootTest
class DeleteDelivery {
	@Autowired
	DeliveryService service;
	Date date=new Date();
	@Test
	void contextLoads() {
		DeliveryDTO delivery=new DeliveryDTO(103, 100, "배송중");
		try {
			service.remove(delivery.getDelid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
