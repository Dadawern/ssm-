package com.dadawern.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dadawern.entity.Boy;

public interface BoyDao {

	Boy queryId(long boyId); //ͨ��ѧ�Ų�ѯ����
	
	List<Boy> queryAll(@Param("offset")int offset,@Param("limit")int limit); //��ѯ��������
	
	int reduceNumber(long boyId); //��������Լ�����
}
