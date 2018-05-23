package com.dadawern.entity;

import java.util.Date;

public class Appointment {

	private long boyId;  //预约约会男生学号
	
	private long studentId; //女生id
	
	private Date appointTime; //约会时间
	
	private String appointPeopleName;//约会人的名字
	
	private Boy boy;//携带实体



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
				+ ", 约会人的名字是" + appointPeopleName + "!!!]";
	}	
	
	
}
