package com.dadawern.serviceimpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dadawern.dao.AppointmentDao;
import com.dadawern.dao.BoyDao;
import com.dadawern.dto.AppointmentExecution;
import com.dadawern.entity.Appointment;
import com.dadawern.entity.Boy;
import com.dadawern.enums.AppointStateEnum;
import com.dadawern.exception.AppointException;
import com.dadawern.exception.NoNumberException;
import com.dadawern.exception.RepeatAppointException;
import com.dadawern.service.BoyService;

@Service
public class BoyServiceImpl implements BoyService{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	//ע��service����
	@Autowired
	private BoyDao boyDao;
	
	@Autowired
	private AppointmentDao appointmentDao;

	@Override
	public Boy queryBoy(long boyId) {
		// TODO Auto-generated method stub
		return boyDao.queryId(boyId);
	}

	@Override
	public List<Boy> queryAll() {
		// TODO Auto-generated method stub
		return boyDao.queryAll(0, 4);
	}

	@Override
	@Transactional
	/**
	 * ʹ��ע��������񷽷����ŵ㣺 1.�����ŶӴ��һ��Լ������ȷ��ע���񷽷��ı�̷��
	 * 2.��֤���񷽷���ִ��ʱ�価���̣ܶ���Ҫ�����������������RPC/HTTP������߰��뵽���񷽷��ⲿ
	 * 3.�������еķ�������Ҫ������ֻ��һ���޸Ĳ�����ֻ����������Ҫ�������
	 */
	public AppointmentExecution appoint(long boyId, long studentId,String appointPeopleName) {
		try {
		//���ٿ��
		int update=boyDao.reduceNumber(boyId);
		
		if(update<=0)
		{//Լ���������
		//	return new AppointmentExcution(bookId,AppointStateEnum.NO_NUMBER);
			throw new NoNumberException("��ѽѽ��û���������Ŷ~");
			}
		else {
			//ִ��ԤԼ����
			int insert=appointmentDao.insertAppointment(boyId, studentId, appointPeopleName);
			if(insert<=0)//�ظ�ԤԼ
			{
				throw new RepeatAppointException("��ԤԼ̫���������Ҫ̰��Ŷ~");
			}
			else {//ԤԼ�ɹ�
				Appointment appointment=appointmentDao.queryDatebigbattle(boyId, studentId);
				return new AppointmentExecution(boyId,AppointStateEnum.success,appointment);
			}
		}
		//Ҫ����catch Exception�쳣ǰ��catchס���׳�����Ȼ�Զ�����쳣Ҳ�ᱻת��ΪAppointException�����¿��Ʋ��޷�����ʶ�����ĸ��쳣
		}catch(NoNumberException e1) {
			throw e1;
		}
		catch(RepeatAppointException e2) {
			throw e2;
		}
		catch(Exception e) {
			logger.error(e.getMessage(),e);
			//���б������쳣ת��Ϊ�������쳣
			throw new AppointException("appoint inner error:" + e.getMessage());
		}
	}
	

}
