package com.multi.liked;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.LikedDTO;
import com.multi.service.LikedService;


@SpringBootTest
class GetLiked {

	@Autowired
	LikedService service;
	
	@Test
	void contextLoads() {
		LikedDTO like = null;
		try {
			like = service.get(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(like);
	}

}