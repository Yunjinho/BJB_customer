package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartService service;
	
	@RequestMapping("")
	public String main(Model model) {
		List<CartDTO> list=null;
		try {
			list=service.viewCart(125);
			model.addAttribute("obj", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
		return "cart";
	}
}
