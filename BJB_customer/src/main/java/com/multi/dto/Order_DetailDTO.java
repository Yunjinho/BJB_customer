package com.multi.dto;



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
public class Order_DetailDTO {

	int detailid;
	int orderid;
	int itemid;
	int cnt;
	int price;
	String color;
	String size;
	
	
	String cust_name;
	String item_name;
}
