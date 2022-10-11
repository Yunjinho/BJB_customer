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
public class CustDTO {
	private int custid;
	private int tierid;
	private String pwd;
	private String name;
	
	private String gender;
	private String addr;
	private String phone;
	private String email;
	private Date rdate;
	private int acc_amount;
	private String birth;
	
	private String tier_tier;
}