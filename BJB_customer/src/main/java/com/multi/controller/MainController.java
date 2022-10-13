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
			cust = custservice.get("dbswlsgh1238");
			model.addAttribute("custdetail", cust);
			model.addAttribute("center", "mypage");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/custdetail")
	public String custdetail(Model model) {
		CustDTO cust = null;
		try {
			cust = custservice.get("dbswlsgh1238");
			model.addAttribute("custdetail", cust);
			model.addAttribute("center", "custdetail");
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
   public String loginimpl(String id, String pwd, Model model, HttpSession session) {   
      CustDTO cust = null;
      try {
         cust = custservice.get(id);
         if(cust == null) {
            model.addAttribute("center", "loginfail");
         } else {
            if(pwd.equals(cust.getPwd())) {
               session.setAttribute("logincust", cust);
       
            } else {
               model.addAttribute("center", "loginfail");
            }
         }
      } catch (Exception e) {      
         e.printStackTrace();
      }

      return "index";
   }

   @RequestMapping("/register")
   public String register(Model model) { 
      model.addAttribute("center", "register");
      return "index";
   }
   
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, CustDTO cust, HttpSession session) {
		
		try {
			custservice.register(cust); 
			model.addAttribute("center","registerok");
			model.addAttribute("rid",cust); 
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("center","registerfail");
			model.addAttribute("fid",cust.getCustid()); 
		}
		
		return "index";
	}

}


