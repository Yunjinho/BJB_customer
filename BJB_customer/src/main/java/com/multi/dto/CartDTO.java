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
	private int custid;
	private int itemid;
	private int cnt;
	private Date date;
	
	
	// 조인할 때 필요한 컬럼명
	private String cust_name;
	private String item_name;
	private int item_price;
	private String item_imgname;
	
}
