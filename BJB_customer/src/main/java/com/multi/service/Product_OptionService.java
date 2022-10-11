package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.Product_OptionDTO;
import com.multi.frame.MyService;
import com.multi.mapper.Product_OptionMapper;

@Service
public class Product_OptionService implements MyService<Integer, Product_OptionDTO> {
	
	@Autowired
	Product_OptionMapper mapper;

	@Override
	public void register(Product_OptionDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Product_OptionDTO v) throws Exception {
		 mapper.update(v);
		
	}

	@Override
	public Product_OptionDTO get(Integer k) throws Exception {
		
		return mapper.select(k);
	}

	@Override
	public List<Product_OptionDTO> get() throws Exception {
		return mapper.selectAll();
	}
	
	public List<Product_OptionDTO> viewProduct(Integer itemid) throws Exception {
		return mapper.viewProduct(itemid);
	}
	
}
