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
	private String custid;
	private int itemid;
	
	private String name;
	private int price;
	private String image1;
	
}
