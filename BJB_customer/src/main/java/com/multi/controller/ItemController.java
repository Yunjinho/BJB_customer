package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CateDTO;
import com.multi.service.CateService;
import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	CateService cate_service;
	
	@Autowired
	ItemService itemservice;
	
	String dir = "item/";
	


	@RequestMapping("/outer")
	public String jacket(Model model) {
		List<CateDTO> list = null; // 자켓 페이지 카테고리용
		List<ItemDTO> item = null; // 자켓 페이지용
		try {
			list = cate_service.viewCateTopid(10);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"outer");
			item = itemservice.selectItemAll(11);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/top")
	public String top(Model model) {
		List<CateDTO> list = null; // 상의 페이지 하위카테고리 리스트
		List<ItemDTO> item = null; // 상의 페이지 아이템 리스트
		try {
			list = cate_service.viewCateTopid(20);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"top");
			item = itemservice.selectItemAll(21);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/bottom")
	public String bottom(Model model) {
		List<CateDTO> list = null; // 하의 페이지 하위카테고리 리스트
		List<ItemDTO> item = null; // 하의 페이지 아이템 리스트
		try {
			list = cate_service.viewCateTopid(30);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"bottom");
			item = itemservice.selectItemAll(31);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/acc")
	public String acc(Model model) {
		List<CateDTO> list = null; // 악세사리 페이지 하위카테고리 리스트
		List<ItemDTO> item = null; // 악세사리 페이지 아이템 리스트
		try {
			list = cate_service.viewCateTopid(40);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"acc");
			item = itemservice.selectItemAll(41);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
}
