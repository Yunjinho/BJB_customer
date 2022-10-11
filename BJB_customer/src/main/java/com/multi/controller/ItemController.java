package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {
	String dir ="item";
	@RequestMapping("/item")
	public String main() {
		return dir+"/item";
	}
}
