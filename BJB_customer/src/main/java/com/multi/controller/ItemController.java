package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	ItemService service;
	
	String dir = "item/";
	
/*	@RequestMapping("/outer")
	public String outer(Model model) {
		model.addAttribute("center", dir+"outer");
		return "index";
	}*/
	
	@RequestMapping("/outer")
	public String jacket(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.selectItemAll(11);
			model.addAttribute("obj", list);
			model.addAttribute("center", dir+"outer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
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
