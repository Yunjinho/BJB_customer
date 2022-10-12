package com.multi.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	@RequestMapping("/cart")
	public String cart(Model model,String id) {
		try {
			model.addAttribute("center", "cart");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "main";
	}

}
