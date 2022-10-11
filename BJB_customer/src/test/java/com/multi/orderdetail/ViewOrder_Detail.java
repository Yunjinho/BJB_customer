package com.multi.orderdetail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.Order_DetailDTO;
import com.multi.service.Order_DetailService;
@SpringBootTest
class ViewOrder_Detail {
	@Autowired
	Order_DetailService service;
	
	@Test
	void contextLoads() {
		List<Order_DetailDTO> list = null;
		try {
			list = service.viewOrder_Detail(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Order_DetailDTO c:list) {
			System.out.println(c);
		}
	}


}
