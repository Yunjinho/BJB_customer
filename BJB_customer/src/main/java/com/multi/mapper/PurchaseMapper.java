package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.PurchaseDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface PurchaseMapper extends MyMapper<Integer,PurchaseDTO>{
	public List<PurchaseDTO> viewPurchase(int custid) throws Exception;
	
}