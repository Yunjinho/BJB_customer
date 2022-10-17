package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CartDTO {
	//카드 테이블 컬럼명
	private int cartid;
	private String custid;
	private int itemid;
	private int cnt;
	private Date date;
	
	
	// 조인할 때 필요한 컬럼명
	private String image1;
	private int price;
	private int prod_totalprice;
	private String name;
	private int cart_totalprice;
	private int cart_totalcnt;
	private int cartcnt;
	
}
