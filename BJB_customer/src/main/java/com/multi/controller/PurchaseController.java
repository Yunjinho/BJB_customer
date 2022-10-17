package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.dto.CustDTO;
import com.multi.dto.PurchaseDTO;
import com.multi.service.CartService;
import com.multi.service.CustService;
import com.multi.service.PurchaseService;

@Controller
public class PurchaseController {
	@Autowired
	MainController mc;
	@Autowired
	CustService custservice;
	
	@Autowired
	CartService cartservice;
	
	@Autowired
	PurchaseService service;
	
	@RequestMapping("/purchase")
	public String purchase(Model model,String custid) {
		
		List<CartDTO> list = null;
		try {
			list = cartservice.viewCart(custid);
			model.addAttribute("obj", list);
			model.addAttribute("center", "cart");
			if (list.size()==0) {
				CartDTO temp=new CartDTO(0, custid, 0, 0, null, custid, null, custid, 0, 0, custid, 0,0, 0);
				model.addAttribute("obj2", temp);
				return "index";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 장바구니의 최종 합계 금액 넘기기
		int sum = 0;
		int cnt=0;
		for (CartDTO l : list) {
			sum += l.getProd_totalprice();
			cnt+=l.getCnt();
		}
		CartDTO cart = null;
		cart = list.get(0);
		cart.setCustid(custid);
		cart.setCart_totalprice(sum);
		cart.setCart_totalcnt(cnt);
		model.addAttribute("obj2", cart);
		
		CustDTO cust = null;
		try {
			cust = custservice.get(custid);
			model.addAttribute("custdetail", cust);
			model.addAttribute("center", "purchase");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
	@RequestMapping("/purchaseimpl")
	public String registerimpl(Model model, PurchaseDTO purchase) {
		try {
			service.register(purchase);
			mc.maincenter(model);
			int r = purchase.getOrderid();
			
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "index";
	}
}
