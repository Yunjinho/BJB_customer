package com.multi.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.multi.dto.CustDTO;
import com.multi.service.CustService;



@Controller
public class MainController {
	
	@Autowired
	CustService cust_service;
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
