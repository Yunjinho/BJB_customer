package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class PurchaseDTO {
	private int orderid;
	private String custid;
	private String addr;
	private String pay;
	private int totalprice;
	private String receiver;
	private String receiver_phone;
	private int totalcnt;
	private String delstate;
	private Date order_date;
	
	private String item_name;
	private String cust_phone;
	private String item_image1;
	
	
}
