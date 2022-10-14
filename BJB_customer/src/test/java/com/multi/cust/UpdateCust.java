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
//		CustDTO cust = new CustDTO("wh1357", 1, "pwd08", "박명수", "남", 99,"경기도 dddddddd", "00000000002", "pk@gmail.com", null, 100000, "1970-12-12", "BRONZE");
//		CustDTO cust = new CustDTO("wh1357", 1, "123", "조한나", "여", 0,"서울 관악구 쑥고개로 1,21", "01095283398", "wh467925@naver.com", null, 0, "2022-10-11", "BRONZE");
		try {
			service.modify(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UPDATE OK");
	}

}