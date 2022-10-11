package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.Product_OptionDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface Product_OptionMapper extends MyMapper<Integer, Product_OptionDTO> {
	public List<Product_OptionDTO> viewProduct(Integer itemid) throws Exception;

}
