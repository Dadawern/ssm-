package com.dadawern.enums;

/**
 * ʹ��ö�ٱ������������ֵ�
 */
public enum AppointStateEnum {

	success(1,"��ϲ�㣬Լ��ɹ���"),
	no_number(0,"������˼����λ����̫������"),
	repeat_appoint(-1,"���Ѿ�ԤԼ������Ŷ"),
	inner_error(-2,"������˼!ϵͳ�쳣TAT");
	
	private int state;
	
	private String stateInfo;

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	private AppointStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}
	
	public static AppointStateEnum stateOf(int index) {
		for (AppointStateEnum state : values()) {
			if (state.getState() == index) {
				return state;
			}
		}
		return null;
	}
	
}
