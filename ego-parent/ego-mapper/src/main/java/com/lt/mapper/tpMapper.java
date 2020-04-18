package com.lt.mapper;

import java.util.List;

import com.lt.pojo.tp;


public interface tpMapper {
	//查询所有的图片
	public List<tp> getAll();
	
	//添加图片
	public int addTp(tp t);
}
