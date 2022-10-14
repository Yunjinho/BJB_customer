package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class UpdateCust {

	@Autowired
	CustService service;
	
	@Test
	void contextLoads() {

		CustDTO cust = new CustDTO("wh1357", 1, "ddd", "sss", "여", 12, "경기도", "010-999-999", "sss@gmail.com", null, 10000, , "BRONZE");

		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UPDATE OK");
	}

}