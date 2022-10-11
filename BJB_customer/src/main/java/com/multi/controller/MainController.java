package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/viewoption")
	public String viewoption() {
		return "viewoption";
	}
}
