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

	@RequestMapping("/mypage")
	public String mypage(Model model) {
		model.addAttribute("center", "mypage");
		return "main";
	}
	


}
