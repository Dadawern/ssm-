package com.dadawern.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dadawern.BaseTest;
import com.dadawern.entity.Appointment;

public class AppointmentDaoTest extends BaseTest {

	@Autowired
	private AppointmentDao appointmentDao;
	
	@Test
	public void testInsertAppointment() throws Exception
	{
		long boyId=201511621302L;
		long studentId=11000;
		String appointPeopleName="Èç»¨»¨";
		int insert=appointmentDao.insertAppointment(boyId, studentId,appointPeopleName);
		System.out.println("insert="+insert);
	}
   
	@Test
	public void testQueryDatebigbattle() throws Exception
	{
		long boyId=201511621302L;
		long studentId=11000;
		Appointment appointment=appointmentDao.queryDatebigbattle(boyId, studentId);
		System.out.println(appointment);
		System.out.println(appointment.getBoy());
	}
}
