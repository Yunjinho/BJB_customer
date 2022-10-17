package com.multi.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.dto.CustDTO;
import com.multi.dto.ItemDTO;
import com.multi.dto.PurchaseDTO;
import com.multi.mapper.AJAXMapper;
import com.multi.mapper.ItemMapper;
import com.multi.service.CartService;
import com.multi.service.CustService;
import com.multi.service.ItemService;
import com.multi.service.PurchaseService;

@Controller
public class MainController {

	@Autowired
	CustService custservice;
	
	@Autowired
	ItemService itemservice;
	
	@Autowired
	PurchaseService purchaseservice;
	
	@Autowired
	ItemMapper item_mapper;
	
	@Autowired
	AJAXMapper mapper;


	public void maincenter(Model model) {
		ItemDTO item1 = null;
		ItemDTO item2 = null;
		ItemDTO item3 = null;
		List<ItemDTO> list = null;
		try {
			item1 = item_mapper.newItem1();
			model.addAttribute("obj1", item1);
			item2 = item_mapper.newItem2();
			model.addAttribute("obj2", item2);
			item3 = item_mapper.newItem3();
			model.addAttribute("obj3", item3);
			list = item_mapper.randomItem();
			for(int i=0;i<=5;i++) {
				model.addAttribute("list"+i, list.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/")
	public String main(Model model,HttpSession session) {
		maincenter(model);
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
		List<PurchaseDTO> list = null;
		try {
			cust = custservice.get(custid);
			model.addAttribute("custdetail", cust);
			list = purchaseservice.orderlist(custid);
			model.addAttribute("orderlist", list);
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
			System.out.println(cust);
			model.addAttribute("custdetail2", cust);
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
	public String logout(Model model,HttpSession session) {
		
		if(session != null) {
			session.invalidate();
			maincenter(model);
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
               maincenter(model);
            } else {
            	 model.addAttribute("status", "0");
            	 model.addAttribute("center", "login");
            	 }
         }
      } catch (Exception e) {      
         e.printStackTrace();
      }

      return "index";
   }
   
   @RequestMapping("/search")
   public String searchItem(Model model, String txt) {
	   List<ItemDTO> list = null;
	   System.out.println(txt);
	   model.addAttribute("obj", list);
	   try {
		list = item_mapper.searchItem(txt);
		model.addAttribute("obj", list);
	} catch (Exception e) {
		e.printStackTrace();
	}
	   model.addAttribute("center", "search");
	   return "index";
   }

   @RequestMapping("/register")
   public String register(Model model) { 
      model.addAttribute("center", "register");
      model.addAttribute("registatus", "1");
      return "index";
   }
   
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, CustDTO cust) {
		
		try {
			custservice.register(cust); 
			model.addAttribute("center","login");
			model.addAttribute("registatus", "1");
			
		} catch (Exception e) {
			model.addAttribute("center", "register");
			model.addAttribute("registatus", "0");
			e.printStackTrace();
		}
		
		return "index";
	}

}


