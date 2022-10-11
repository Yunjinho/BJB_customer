package com.multi.liked;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.LikedDTO;
import com.multi.service.LikedService;


@SpringBootTest
	class ViewLikedCustid {
	
	@Autowired
	LikedService service;
	
	@Test
	void contextLoads() {
		
		List<LikedDTO> list = null;
		
		try {
			list = service.viewLikedCustid(123);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(LikedDTO l:list) {
			System.out.println(l);
		}
	}

}