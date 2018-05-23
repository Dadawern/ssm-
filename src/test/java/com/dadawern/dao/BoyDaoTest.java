package com.dadawern.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dadawern.BaseTest;
import com.dadawern.entity.Boy;

public class BoyDaoTest extends BaseTest {

	@Autowired
	private BoyDao boyDao;

     @Test
	public void testQueryId() throws Exception
	{
		long boyId=201511621320L;
		Boy boy=boyDao.queryId(boyId);
		System.out.println(boy);
		
	}
	
     @Test
	public void testQueryAll() throws Exception
	{
		List<Boy> boys=boyDao.queryAll(0,4);
		for(Boy boy:boys)
		{
			System.out.println(boy);
		}
	}
     
     @Test
	public void testReduceNumber()
	{
		long boyId=201511621320L;
		int update=boyDao.reduceNumber(boyId);
		System.out.println("update="+update);
	}
}
