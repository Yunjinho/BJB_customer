package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.LikedDTO;
import com.multi.frame.MyService;
import com.multi.mapper.LikedMapper;

@Service
public class LikedService implements MyService<Integer, LikedDTO>{
	
	@Autowired
	LikedMapper mapper;

	@Override
	public void register(LikedDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(LikedDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public LikedDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<LikedDTO> get() throws Exception {
		return mapper.selectAll();
	}
	
	public List<LikedDTO> viewLikedCustid(int custid) throws Exception {
		return mapper.viewLikedCustid(custid);
	}
	
	public List<LikedDTO> viewLikedItemid(int itemid) throws Exception {
		return mapper.viewLikedItemid(itemid);
	}
	
}
