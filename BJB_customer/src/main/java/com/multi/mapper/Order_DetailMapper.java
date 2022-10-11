package com.multi.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.multi.dto.Order_DetailDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface Order_DetailMapper extends MyMapper<Integer,Order_DetailDTO> {
	public List<Order_DetailDTO> ViewOrder_Detail(Integer orderid) throws Exception;
	
}
