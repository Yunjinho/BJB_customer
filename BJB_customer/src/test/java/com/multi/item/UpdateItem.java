package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;


@SpringBootTest
class UpdateItem {
	@Autowired
	ItemService service;
	
	@Test
	void contextLoads() {
		ItemDTO item = new ItemDTO(1057, 11, "유넥", 500000, "c,jpg", "b.jpg", "a.jpg", null, null, null, 0);
		try {
			service.modify(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
