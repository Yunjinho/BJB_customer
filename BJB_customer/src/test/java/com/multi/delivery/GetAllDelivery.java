package com.multi.delivery;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.DeliveryDTO;
import com.multi.service.DeliveryService;

@SpringBootTest
class GetAllDelivery {
	@Autowired
	DeliveryService service;
	
	@Test
	void contextLoads() {
		List<DeliveryDTO> list=null;
		try {
			list = service.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(DeliveryDTO i:list) {
			System.out.println(i);
		}
		
	}
}
