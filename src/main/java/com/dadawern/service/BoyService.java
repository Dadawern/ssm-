package com.dadawern.service;

import java.util.List;

import com.dadawern.dto.AppointmentExecution;
import com.dadawern.entity.Boy;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */

public interface BoyService {

	//查询想约会男生的功能功能
	/**
	 * 查询一个男孩
	 * 
	 * @param bookId
	 * @return
	 */
	Boy queryBoy(long boyId);
	//查询所有男生的功能
	/**
	 * 查询所有男孩
	 * 
	 * @return
	 */
	List<Boy> queryAll();
	//预约男生功能
	/**
	 * 预约男生
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointmentExecution appoint(long boyId,long studentId,String appointPeopleName);
}
