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
public class LikedDTO {
	
	private int likedid;
	private int custid;
	private int itemid;
	
	private String item2_name;
	private int item2_price;
	
}
