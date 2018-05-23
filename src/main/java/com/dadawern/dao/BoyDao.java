package com.dadawern.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dadawern.entity.Boy;

public interface BoyDao {

	Boy queryId(long boyId); //通过学号查询男生
	
	List<Boy> queryAll(@Param("offset")int offset,@Param("limit")int limit); //查询所有男生
	
	int reduceNumber(long boyId); //减少男生约会次数
}
