package com.dadawern.dto;

import com.dadawern.entity.Appointment;
import com.dadawern.enums.AppointStateEnum;

/**
 * ��װԤԼִ�к���
 */
public class AppointmentExecution {

	// ͼ��ID
	private long boyId;

	// ��ɱԤԼ���״̬
	private int state;

	// ״̬��ʶ
	private String stateInfo;

	// ԤԼ�ɹ�����
	private Appointment appointment;

	public AppointmentExecution() {
	}

	// ԤԼʧ�ܵĹ�����
	public AppointmentExecution(long bookId, AppointStateEnum stateEnum) {
		this.boyId = bookId;
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}

	// ԤԼ�ɹ��Ĺ�����
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
