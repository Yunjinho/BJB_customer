package com.multi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.multi.dto.Order_DetailDTO;
import com.multi.frame.MyService;
import com.multi.mapper.Order_DetailMapper;

@Service
public class Order_DetailService implements MyService<Integer,Order_DetailDTO> {
	
	@Autowired
	Order_DetailMapper mapper;

	@Override
	public void register(Order_DetailDTO v) throws Exception {
		mapper.insert(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(Order_DetailDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public Order_DetailDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<Order_DetailDTO> get() throws Exception {
		return mapper.selectAll();
	}

	public List<Order_DetailDTO> viewOrder_Detail(Integer orderid) throws Exception {
		return mapper.ViewOrder_Detail(orderid);
	}

}
