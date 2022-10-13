package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	
	String dir = "item/";
	
	@RequestMapping("/outer")
	public String outer(Model model) {
		model.addAttribute("center", dir+"outer");
		return "index";
	}
	
//	@RequestMapping("/outer")
//	public String outer() {
//		return dir + "outer";
//	}
	
	@RequestMapping("/top")
	public String top() {
		return dir + "top";
	}
	
	@RequestMapping("/bottom")
	public String bottom() {
		return dir + "bottom";
	}
	
	@RequestMapping("/acc")
	public String acc() {
		return dir + "acc";
	}
	
	

}
