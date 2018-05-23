package com.dadawern.enums;

/**
 * 使用枚举表述常量数据字典
 */
public enum AppointStateEnum {

	success(1,"恭喜你，约会成功！"),
	no_number(0,"不好意思，这位男生太抢手了"),
	repeat_appoint(-1,"您已经预约过他了哦"),
	inner_error(-2,"不好意思!系统异常TAT");
	
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
