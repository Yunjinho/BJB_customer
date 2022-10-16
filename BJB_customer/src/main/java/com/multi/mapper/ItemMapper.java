package com.multi.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ItemDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface ItemMapper extends MyMapper<Integer, ItemDTO>{
	public List<ItemDTO> viewItemAll() throws Exception;
	public List<ItemDTO> selectItemAll(int cateid) throws Exception;
	public List<ItemDTO> searchItem(String txt) throws Exception;
	public ItemDTO newItem1() throws Exception;
	public ItemDTO newItem2() throws Exception;
	public ItemDTO newItem3() throws Exception;
	public List<ItemDTO> randomItem() throws Exception;
}