package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.DeliveryDTO;
import com.multi.dto.PurchaseDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface DeliveryMapper extends MyMapper<Integer,DeliveryDTO>{
	public List<DeliveryDTO> viewDelivery(int orederid) throws Exception;
}