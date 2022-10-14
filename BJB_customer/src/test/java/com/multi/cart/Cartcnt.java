package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.mapper.AJAXMapper;
import com.multi.service.CartService;

@SpringBootTest
class Cartcnt {

	@Autowired
	CartService service;
	@Autowired
	AJAXMapper mapper;
	@Test
	void contextLoads() {
		int cnt = 0;
		int cnt2 = 0;
		try {
			cnt=mapper.getCartCnt("dbswlsgh1238");
			cnt2=mapper.getLikedCnt("dbswlsgh1238");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cnt);
		System.out.println(cnt2);
	}

}




