package com.lt.mapper;

import java.util.List;

import com.lt.pojo.tp;


public interface tpMapper {
	//��ѯ���е�ͼƬ
	public List<tp> getAll();
	
	//���ͼƬ
	public int addTp(tp t);
}
