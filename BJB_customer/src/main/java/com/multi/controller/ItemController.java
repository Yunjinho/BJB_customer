package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CateDTO;
import com.multi.service.CateService;

@Controller
public class ItemController {
	
	@Autowired
	CateService cate_service;
	
	String dir = "item/";
	
	@RequestMapping("/outer")
	public String outer(Model model) {
		List<CateDTO> list = null;
		try {
			list = cate_service.viewCateTopid(10);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"outer");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/top")
	public String top(Model model) {
		List<CateDTO> list = null;
		try {
			list = cate_service.viewCateTopid(20);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"top");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/bottom")
	public String bottom(Model model) {
		List<CateDTO> list = null;
		try {
			list = cate_service.viewCateTopid(30);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"bottom");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/acc")
	public String acc(Model model) {
		List<CateDTO> list = null;
		try {
			list = cate_service.viewCateTopid(40);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"acc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	

}
