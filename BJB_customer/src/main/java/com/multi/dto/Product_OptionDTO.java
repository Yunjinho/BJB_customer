package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Product_OptionDTO {
	private int optionid;
	private int itemid;
	private String color;
	private String size;
	private int stock;
	
	private String item_name;
	

}
