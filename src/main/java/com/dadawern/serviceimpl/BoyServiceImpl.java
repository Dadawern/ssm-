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
	
	//注入service依赖
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
	 * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
	public AppointmentExecution appoint(long boyId, long studentId,String appointPeopleName) {
		try {
		//减少库存
		int update=boyDao.reduceNumber(boyId);
		
		if(update<=0)
		{//约会次数不足
		//	return new AppointmentExcution(bookId,AppointStateEnum.NO_NUMBER);
			throw new NoNumberException("哎呀呀，没有这个男生哦~");
			}
		else {
			//执行预约操作
			int insert=appointmentDao.insertAppointment(boyId, studentId, appointPeopleName);
			if(insert<=0)//重复预约
			{
				throw new RepeatAppointException("你预约太多次拉，不要贪杯哦~");
			}
			else {//预约成功
				Appointment appointment=appointmentDao.queryDatebigbattle(boyId, studentId);
				return new AppointmentExecution(boyId,AppointStateEnum.success,appointment);
			}
		}
		//要先于catch Exception异常前先catch住再抛出，不然自定义的异常也会被转换为AppointException，导致控制层无法具体识别是哪个异常
		}catch(NoNumberException e1) {
			throw e1;
		}
		catch(RepeatAppointException e2) {
			throw e2;
		}
		catch(Exception e) {
			logger.error(e.getMessage(),e);
			//所有编译期异常转换为运行期异常
			throw new AppointException("appoint inner error:" + e.getMessage());
		}
	}
	

}
