package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.LikedDTO;
import com.multi.service.LikedService;

@Controller
public class LikedController {
	@Autowired
	LikedService service;
	
	@RequestMapping("/liked")
	public String main(Model model) {
		//아이디 가지고 장바구니 리스트 넘기기
		List<LikedDTO> list=null;
		try {
			list=service.viewLikedCustid("dbswlsgh1238");
			model.addAttribute("obj", list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("center","liked");
			
		return "index";
	}
}
