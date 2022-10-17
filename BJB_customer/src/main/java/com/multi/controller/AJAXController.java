package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.CartDTO;
import com.multi.mapper.AJAXMapper;
import com.multi.service.CartService;

@RestController
public class AJAXController {
	
	@Autowired
	AJAXMapper mapper;
	
	@RequestMapping("/likedcnt")
	public String likedcnt() {
		int cnt=0;
		cnt=mapper.getLikedCnt("dbswlsgh1238");
		return cnt+"";
	}
	
	@RequestMapping("/cartcnt")
	public String cartcnt() {
		int cnt=0;
		cnt=mapper.getCartCnt("dbswlsgh1238");
		return cnt+"";
	}
	
	
}
