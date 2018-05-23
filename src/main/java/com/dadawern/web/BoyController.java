package com.dadawern.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dadawern.dto.AppointmentExecution;
import com.dadawern.dto.Result;
import com.dadawern.entity.Boy;
import com.dadawern.enums.AppointStateEnum;
import com.dadawern.exception.NoNumberException;
import com.dadawern.exception.RepeatAppointException;
import com.dadawern.service.BoyService;

@Controller
@RequestMapping("/boy")
public class BoyController {

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BoyService boyService;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model)
	{
		List<Boy> list=boyService.queryAll();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndView
		return "list";// WEB-INF/jsp/"list".jsp
	}
	
	@RequestMapping(value="/{boyId}/detail",method=RequestMethod.GET)
	public String detail(@PathVariable("boyId")Long boyId,Model model)
	{
		if(boyId==null)
		{
			return "redirect:/boy/list";
		}
		
		Boy boy=boyService.queryBoy(boyId);
		if(boy==null)
		{
			return "forward:/boy/list";
		}
		model.addAttribute("boy", boy);
		return "detail";
	}

	//ajax json
		@RequestMapping(value = "/{boyId}/appoint", method = RequestMethod.POST, produces = {
				"application/json; charset=utf-8" })
        @ResponseBody
    	private Result<AppointmentExecution> appoint(@PathVariable("boyId") Long boyId, @RequestParam("studentId") Long studentId,@RequestParam("appointPeopleName")String appointPeopleName) {
    		if (studentId == null || studentId.equals("")) {
    			return new Result<>(false, "学号不能为空");
    		}
    		//AppointmentExecution execution = boyService.appoint(boyId, studentId);//错误写法，不能统一返回，要处理异常（失败）情况
    		AppointmentExecution execution = null;
    		try {
    			execution = boyService.appoint(boyId, studentId,appointPeopleName);
    		} catch (NoNumberException e1) {
    			execution = new AppointmentExecution(boyId, AppointStateEnum.no_number);
    		} catch (RepeatAppointException e2) {
    			execution = new AppointmentExecution(boyId, AppointStateEnum.repeat_appoint);
    		} catch (Exception e) {
    			execution = new AppointmentExecution(boyId, AppointStateEnum.inner_error);
    		}
    		return new Result<AppointmentExecution>(true, execution);
    	}
	
}
