package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CateDTO;
import com.multi.service.CateService;
import com.multi.dto.ItemDTO;
import com.multi.dto.Product_OptionDTO;
import com.multi.service.ItemService;
import com.multi.service.Product_OptionService;

@Controller
public class ItemController {
	
	@Autowired
	CateService cate_service;
	
	@Autowired
	ItemService itemservice;
	
	@Autowired
	Product_OptionService poservice;
	
	String dir = "item/";
	


	@RequestMapping("/outer")
	public String jacket(Model model,int cateid) {
		List<CateDTO> list = null; // 자켓 페이지 카테고리용
		List<ItemDTO> item = null; // 자켓 페이지용
		try {
			list = cate_service.viewCateTopid(10);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"outer");
			item = itemservice.selectItemAll(cateid);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/top")
	public String top(Model model,int cateid) {
		List<CateDTO> list = null; // 상의 페이지 하위카테고리 리스트
		List<ItemDTO> item = null; // 상의 페이지 아이템 리스트
		try {
			list = cate_service.viewCateTopid(20);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"top");
			item = itemservice.selectItemAll(cateid);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/bottom")
	public String bottom(Model model,int cateid) {
		List<CateDTO> list = null; // 하의 페이지 하위카테고리 리스트
		List<ItemDTO> item = null; // 하의 페이지 아이템 리스트
		try {
			list = cate_service.viewCateTopid(30);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"bottom");
			item = itemservice.selectItemAll(cateid);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/acc")
	public String acc(Model model,int cateid) {
		List<CateDTO> list = null; // 악세사리 페이지 하위카테고리 리스트
		List<ItemDTO> item = null; // 악세사리 페이지 아이템 리스트
		try {
			list = cate_service.viewCateTopid(40);
			model.addAttribute("catelist", list);
			model.addAttribute("center", dir+"acc");
			item = itemservice.selectItemAll(cateid);
			model.addAttribute("obj", item);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/itemdetail")
	public String itemdetail(Model model, int itemid) {
		ItemDTO item = null;
		List<CateDTO> list = null;
		List<Product_OptionDTO> pocolorlist = null;
		try {
			item = itemservice.get(itemid);
			list = cate_service.viewCateName(itemid);
			model.addAttribute("catelist", list);
			model.addAttribute("itemdetail", item);
			model.addAttribute("center", dir + "itemdetail");
			pocolorlist = poservice.viewProduct(itemid);
			model.addAttribute("pocolorlist", pocolorlist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
}
