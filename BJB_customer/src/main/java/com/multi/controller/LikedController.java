package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.dto.LikedDTO;
import com.multi.service.LikedService;

@Controller
public class LikedController {
	@Autowired
	LikedService service;
	
	@RequestMapping("/liked")
	public String main(Model model,String custid) {
		//아이디 가지고 장바구니 리스트 넘기기
		List<LikedDTO> list = null;
		try {
			list = service.viewLikedCustid(custid);
			model.addAttribute("obj", list);
			model.addAttribute("center", "liked");
			if (list.size()==0) {
				LikedDTO temp=new LikedDTO(0, custid, 0, custid, 0, custid, 0);
				model.addAttribute("obj2", temp);
				return "index";
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LikedDTO liked = null;
		liked = list.get(0);
		liked.setCustid(custid);
		model.addAttribute("obj2", liked);
		return "index";
	}
	@RequestMapping("/deleteliked")
	public String deleteliked(Model model,int id,String cust_id) {
		try {
			service.remove(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("center", "liked");
		
		return "redirect:liked?custid="+cust_id;
	}
	
	@RequestMapping("/deletelikedall")
	public String deletelikedall(Model model,int id,String cust_id) {
		try {
			service.deleteall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("center", "liked");
		
		return "redirect:liked?custid="+cust_id;
	}
}
