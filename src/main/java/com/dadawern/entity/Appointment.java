package com.dadawern.entity;

import java.util.Date;

public class Appointment {

	private long boyId;  //ԤԼԼ������ѧ��
	
	private long studentId; //Ů��id
	
	private Date appointTime; //Լ��ʱ��
	
	private String appointPeopleName;//Լ���˵�����
	
	private Boy boy;//Я��ʵ��



	public Appointment(long boyId, long studentId, Date appointTime, String appointpeoplename) {
		this.boyId = boyId;
		this.studentId = studentId;
		this.appointTime = appointTime;
		this.appointPeopleName = appointpeoplename;
	}
	
	

	public Appointment(long boyId, long studentId, Date appointTime, String appointPeopleName, Boy boy) {
		super();
		this.boyId = boyId;
		this.studentId = studentId;
		this.appointTime = appointTime;
		this.appointPeopleName = appointPeopleName;
		this.boy = boy;
	}



	public Appointment() {
	}

	public long getBoyId() {
		return boyId;
	}

	public void setBoyId(long boyId) {
		this.boyId = boyId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	public Boy getBoy() {
		return boy;
	}

	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	
	

	public String getAppointpeoplename() {
		return appointPeopleName;
	}

	public void setAppointpeoplename(String appointpeoplename) {
		this.appointPeopleName = appointpeoplename;
	}

	@Override
	public String toString() {
		return "Appointment [boyId=" + boyId + ", studentId=" + studentId + ", appointTime=" + appointTime
				+ ", Լ���˵�������" + appointPeopleName + "!!!]";
	}	
	
	
}
