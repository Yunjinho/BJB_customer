package com.multi.controller;



import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.service.CustService;
import com.multi.dto.CustDTO;
import com.multi.service.CustService;



@Controller
public class MainController {

	@Autowired
	CustService custservice;
	
	

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
	
	@RequestMapping("/mypage")
	public String mypage(Model model) {
		CustDTO cust = null;
		try {
			cust = custservice.get(123);
			model.addAttribute("custdetail", cust);
			model.addAttribute("center", "mypage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
   @RequestMapping("/login")
   public String login(Model model) { 
	   model.addAttribute("center","login");
      return "index";
   }
 
   
   @RequestMapping("/loginimpl")
   public String loginimpl(int id, String pwd, Model model, HttpSession session) {   
      CustDTO cust = null;
      try {
         cust = custservice.get(id);
         if(cust == null) {
            model.addAttribute("center", "loginfail");
         } else {
            if(pwd.equals(cust.getPwd())) {
               session.setAttribute("logincust", cust);
               model.addAttribute("center", "index");
            } else {
               model.addAttribute("center", "loginfail");
            }
         }
      } catch (Exception e) {      
         e.printStackTrace();
      }

      return "redirect:/";
   }
}


