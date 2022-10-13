package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@Controller
public class CartController {
	@Autowired
	CartService service;
	
	
	@RequestMapping("/cart")
	public String main(Model model) {
		
		//아이디 가지고 장바구니 리스트 넘기기
		List<CartDTO> list=null;
		try {
			list=service.viewCart(125);
			model.addAttribute("obj", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//장바구니의 최종 합계 금액 넘기기
		int sum=0;
		for(CartDTO l:list) {
			sum+=l.getProd_totalprice();
		}
		CartDTO cart=null;
		cart=list.get(0);
		cart.setCart_totalprice(sum);
		model.addAttribute("obj2", cart);
		
		model.addAttribute("center", "cart");
		return "index";
	}
}
