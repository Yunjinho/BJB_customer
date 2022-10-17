package com.multi.controller;

import javax.servlet.http.HttpSession;

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
	
	HttpSession session;
	
	@RequestMapping("/likedcnt")
	public String likedcnt(String custid) {
		int cnt=0;
		cnt=mapper.getLikedCnt(custid);
		return cnt+"";
	}
	
	@RequestMapping("/cartcnt")
	public String cartcnt(String custid) {
		int cnt=0;
		cnt=mapper.getCartCnt(custid);
		return cnt+"";
	}
}
