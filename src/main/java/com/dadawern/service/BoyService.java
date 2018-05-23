package com.dadawern.service;

import java.util.List;

import com.dadawern.dto.AppointmentExecution;
import com.dadawern.entity.Boy;

/**
 * ҵ��ӿڣ�վ��"ʹ����"�Ƕ���ƽӿ� �������棺�����������ȣ��������������ͣ�return ����/�쳣��
 */

public interface BoyService {

	//��ѯ��Լ�������Ĺ��ܹ���
	/**
	 * ��ѯһ���к�
	 * 
	 * @param bookId
	 * @return
	 */
	Boy queryBoy(long boyId);
	//��ѯ���������Ĺ���
	/**
	 * ��ѯ�����к�
	 * 
	 * @return
	 */
	List<Boy> queryAll();
	//ԤԼ��������
	/**
	 * ԤԼ����
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointmentExecution appoint(long boyId,long studentId,String appointPeopleName);
}
