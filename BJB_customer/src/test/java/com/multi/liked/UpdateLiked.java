package com.multi.liked;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.LikedDTO;
import com.multi.service.LikedService;


@SpringBootTest
class UpdateLiked {
	@Autowired
	LikedService service;
	
	@Test
	void contextLoads() {
		LikedDTO liked = new LikedDTO(100, 123, 1001, null, 0);
		try {
			service.modify(liked);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
