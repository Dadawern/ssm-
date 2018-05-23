package com.dadawern.dao;

import org.apache.ibatis.annotations.Param;

import com.dadawern.entity.Appointment;

public interface AppointmentDao {

	//插入约会记录
	int insertAppointment(@Param("boyId")long boyId,@Param("studentId")long studentId,@Param("appointPeopleName")String appointPeopleName);
	
	//查询约会记录
	Appointment queryDatebigbattle(@Param("boyId")long boyId,@Param("studentId")long studentId);
}
