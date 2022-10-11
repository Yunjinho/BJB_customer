package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.multi.dto.Order_DetailDTO;
import com.multi.service.Order_DetailService;



@SpringBootTest
class GetOrder_Detail {
	@Autowired
	Order_DetailService service;
	
	@Test
	void contextLoads() {
		Order_DetailDTO od = null;
		try {
			od = service.get(101);
			System.out.println(od);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
