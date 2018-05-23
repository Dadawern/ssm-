package com.dadawern.entity;

public class Boy {

	private long boyId;  //男生学号
	
	private String name; //男生名称
	
	private int number;  //可约会数量次数

	public long getBoyId() {
		return boyId;
	}

	public void setBoyId(long boyId) {
		this.boyId = boyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Boy [boyId=" + boyId + ", name=" + name + ", number=" + number + "]";
	}

	public Boy(long boyId, String name, int number) {
		
		this.boyId = boyId;
		this.name = name;
		this.number = number;
	}

	public Boy() {
		
	}
	
	
}
