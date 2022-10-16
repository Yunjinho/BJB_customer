package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.mapper.AJAXMapper;
import com.multi.service.CustService;

@Controller
public class MainController {

	@Autowired
	CustService custservice;
	
	@Autowired
	AJAXMapper mapper;

	@RequestMapping("/")
	public String main() {

		return "index";
	}
	@RequestMapping("/categories")
	public String clo() {
		return "categories";
	}

	@RequestMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("center","contact");
		return "index";
	}
	
	@RequestMapping("/custdetail")
	public String custdetail(Model model, String custid) {
		CustDTO cust = null;
		try {
			cust = custservice.get(custid);
			model.addAttribute("custdetail", cust);
			model.addAttribute("center", "custdetail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/custupdate")
	public String custupdate(Model model, String custid) {
		CustDTO cust = null;
		try {
			cust = custservice.get(custid);
			model.addAttribute("custdetail", cust);
			model.addAttribute("center", "custupdate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping("/custupdateimpl")
	public String custupdateimpl(Model model, CustDTO cust) {
		try {
			custservice.modify(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:custdetail?custid="+cust.getCustid();
	}
	
//	@RequestMapping("/custdetail")
//	public String custdetail(Model model, String id) {
//		CustDTO cust = null;
//		try {
//			cust = custservice.get(id);
//			model.addAttribute("custdetail", cust);
//			model.addAttribute("center", "custdetail");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "index";
//	}
	
	
	
   @RequestMapping("/login")
   public String login(Model model) { 
  	 model.addAttribute("status", "1");

	   model.addAttribute("center","login");
      return "index";
   }
 
   @RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		if(session != null) {
			session.invalidate();
		}
		
		return "index";
	}
   
   @RequestMapping("/loginimpl")
   public String loginimpl(String id, String pwd, Model model, HttpSession session) {   
      CustDTO cust = null;
      try {
         cust = custservice.get(id);
         if(cust == null) {
        	 model.addAttribute("status", "0");
        	 model.addAttribute("center", "login");
         } else {
            if(pwd.equals(cust.getPwd())) {
            	model.addAttribute("status", "1");
               session.setAttribute("logincust", cust);
            } else {
            	 model.addAttribute("status", "0");
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
			model.addAttribute("center","login");
			model.addAttribute("rid",cust); 
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("center","registerfail");
			model.addAttribute("fid",cust.getCustid()); 
		}
		
		return "index";
	}

}


