package com.multi.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.CartDTO;
import com.multi.dto.CustDTO;
import com.multi.dto.LikedDTO;
import com.multi.service.CartService;
import com.multi.service.CustService;
import com.multi.service.LikedService;

@RestController 
public class AController {
	
	@Autowired
	CustService custservice;

	@Autowired
	CartService cart_service;
	
	@Autowired
	LikedService liked_service;

	@RequestMapping("/checkid")
	public Object checkid(String cid) {
		String result = "";
		CustDTO cust = null;
		try {
			cust = custservice.get(cid);
			if(cust!=null) {
				result="f";
			}else {
				result="t";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
		}
	public Object addcart(String cust_id,String item_id, String cnt, String color, String size) {
		int itemid=Integer.parseInt(item_id);
		int itemcnt=Integer.parseInt(cnt);
		CartDTO cart=new CartDTO(0, cust_id,itemid, itemcnt, color, size, null, item_id, 0, 0, cnt, 0, 0,0);
		try {
			cart_service.register(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
	@RequestMapping("/addliked")
	public Object addliked(String item_id, String cust_id) {
		int itemid=Integer.parseInt(item_id);
		LikedDTO liked = new LikedDTO(0, cust_id, itemid, null, 0, null, 0);
		try {
			liked_service.register(liked);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	

}
