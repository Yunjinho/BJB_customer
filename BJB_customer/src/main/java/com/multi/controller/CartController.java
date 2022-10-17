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
	String dir = "cart/";

	@RequestMapping("/cart")
	public String main(Model model,String custid) {

		// 아이디 가지고 장바구니 리스트 넘기기
		List<CartDTO> list = null;
		try {
			list = service.viewCart(custid);
			System.out.println(list);
			model.addAttribute("obj", list);
			model.addAttribute("center", "cart");
			if (list.size()==0) {
				CartDTO temp=new CartDTO(0, custid, 0, 0, null, null, null, custid, 0, 0, custid, 0, 0,0);
				model.addAttribute("obj2", temp);
				return "index";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 장바구니의 최종 합계 금액 넘기기
		int sum = 0;
		for (CartDTO l : list) {
			sum += l.getProd_totalprice();
		}
		CartDTO cart = null;
		cart = list.get(0);
		cart.setCustid(custid);
		cart.setCart_totalprice(sum);
		model.addAttribute("obj2", cart);

		return "index";
	}

	@RequestMapping("/deletecart")
	public String deletecart(Model model,int id,String cust_id) {
		try {
			service.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("center", "cart");
		
		return "redirect:cart?custid="+cust_id;
	}
	
	@RequestMapping("/deletecartall")
	public String deletecartall(Model model,int id,String cust_id) {
		try {
			service.deleteall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("center", "cart");
		
		return "redirect:cart?custid="+cust_id;
	}
}
