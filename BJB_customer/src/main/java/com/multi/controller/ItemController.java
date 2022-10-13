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
	
	@RequestMapping("/top")
	public String top(Model model) {
		model.addAttribute("center", dir+"top");
		return "index";
	}
	
	@RequestMapping("/bottom")
	public String bottom(Model model) {
		model.addAttribute("center", dir+"bottom");
		return "index";
	}
	
	@RequestMapping("/acc")
	public String acc(Model model) {
		model.addAttribute("center", dir+"acc");
		return "index";
	}
	

}
