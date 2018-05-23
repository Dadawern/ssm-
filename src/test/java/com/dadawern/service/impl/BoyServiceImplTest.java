package com.dadawern.service.impl;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dadawern.BaseTest;
import com.dadawern.dto.AppointmentExecution;
import com.dadawern.entity.Boy;
import com.dadawern.service.BoyService;


public class BoyServiceImplTest extends BaseTest{

	@Autowired
	private BoyService boyService;
	
	
	@Test
	public void testQueryId() throws Exception
	{
		long boyId=201511621302L;
		Boy boy=boyService.queryBoy(boyId);
		System.out.println(boy);
	}
	
	@Test
	public void testQueryAll() throws Exception
	{
		List<Boy> boys=boyService.queryAll();
		for(Boy boy:boys)
		{
			System.out.println(boy);
		}
	}
	
	@Test
	public void testAppoint() throws Exception
	{
		long boyId=201511621320L;
		long studentId=1;
		String appointPeopleName="…Ú‘¬";
		AppointmentExecution execution = boyService.appoint(boyId, studentId, appointPeopleName);
		System.out.println(execution);
	}
	
}
