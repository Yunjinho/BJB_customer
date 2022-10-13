package com.multi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;


@Controller
public class MainController {
	@Autowired
	CustService custservice; 
	
	@RequestMapping("/")
	public String main() {
		/* model.addAttribute("center", "maincenter"); */
		return "index";
	}
	@RequestMapping("/categories")
	public String clo() {
		return "categories";
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		model.addAttribute("center", "mypage");
		return "index";
	}
	
	@RequestMapping("/cart")
	public String cart() {
		return "cart";
	}
	@RequestMapping("/product")
	public String product() {
		return "product";
	}
	
}
