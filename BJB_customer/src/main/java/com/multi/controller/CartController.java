package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	String dir ="cart";
	
	
	@RequestMapping("/cart")
	public String main() {
		return dir+"/cart";
	}
}
