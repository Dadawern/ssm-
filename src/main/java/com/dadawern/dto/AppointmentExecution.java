package com.dadawern.dto;

import com.dadawern.entity.Appointment;
import com.dadawern.enums.AppointStateEnum;

/**
 * 封装预约执行后结果
 */
public class AppointmentExecution {

	// 图书ID
	private long boyId;

	// 秒杀预约结果状态
	private int state;

	// 状态标识
	private String stateInfo;

	// 预约成功对象
	private Appointment appointment;

	public AppointmentExecution() {
	}

	// 预约失败的构造器
	public AppointmentExecution(long bookId, AppointStateEnum stateEnum) {
		this.boyId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// 预约成功的构造器
	public AppointmentExecution(long bookId, AppointStateEnum stateEnum, Appointment appointment) {
		this.boyId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.appointment = appointment;
	}

	public long getBoyId() {
		return boyId;
	}

	public void setBookId(long boyId) {
		this.boyId = boyId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "AppointExecution [boy Id=" + boyId + ", state=" + state + ", stateInfo=" + stateInfo + ", appointment="
				+ appointment + "]";
	}

}
