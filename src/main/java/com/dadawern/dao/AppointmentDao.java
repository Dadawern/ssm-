package com.dadawern.dao;

import org.apache.ibatis.annotations.Param;

import com.dadawern.entity.Appointment;

public interface AppointmentDao {

	//����Լ���¼
	int insertAppointment(@Param("boyId")long boyId,@Param("studentId")long studentId,@Param("appointPeopleName")String appointPeopleName);
	
	//��ѯԼ���¼
	Appointment queryDatebigbattle(@Param("boyId")long boyId,@Param("studentId")long studentId);
}
