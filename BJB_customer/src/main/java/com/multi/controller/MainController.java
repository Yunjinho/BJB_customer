package com.multi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	@RequestMapping("/")
	public String main() {
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
	
}
