package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CustDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CustMapper;

@Service
public class CustService implements MyService<Integer, CustDTO>{
	
	@Autowired
	CustMapper mapper;

	@Override
	public void register(CustDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}

	@Override
	public void modify(CustDTO v) throws Exception {
		mapper.update(v);
		
	}

	@Override
	public CustDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<CustDTO> get() throws Exception {
		return mapper.selectAll();
	}
	

}