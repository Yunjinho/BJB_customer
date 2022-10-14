package com.multi.liked;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.LikedDTO;
import com.multi.service.LikedService;


@SpringBootTest
class InsertLiked {

	@Autowired
	LikedService service;
	
	@Test
	void contextLoads() {
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




