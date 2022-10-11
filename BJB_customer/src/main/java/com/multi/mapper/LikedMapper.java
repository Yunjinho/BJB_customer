package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.LikedDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface LikedMapper extends MyMapper<Integer, LikedDTO>{

	public List<LikedDTO> viewLikedCustid(int custid) throws Exception;
	public List<LikedDTO> viewLikedItemid(int itemid) throws Exception;
	
}