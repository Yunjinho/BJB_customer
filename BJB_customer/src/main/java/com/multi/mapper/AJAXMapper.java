package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AJAXMapper{
	public int getLikedCnt(String custid);
	public int getCartCnt(String custid);
}