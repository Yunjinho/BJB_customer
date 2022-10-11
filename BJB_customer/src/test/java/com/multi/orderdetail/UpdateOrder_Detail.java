package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_DetailDTO;
import com.multi.service.Order_DetailService;



@SpringBootTest
public class UpdateOrder_Detail {
	@Autowired
	Order_DetailService service;
	@Test
	void contextLoads() {
		Order_DetailDTO od = new Order_DetailDTO(101,11,1003,7,20000,"검정","M",null,null);
		try {
			service.modify(od);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
