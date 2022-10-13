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
public class ItemDTO {
	
	private int itemid;
	private int cateid;
	private String name;
	private int price;
	private String image1;
	private String image2;
	private String image3;
	
	private String cate_name;
	private String po_color;
	private String po_size;
	private int po_stock;
	
}
