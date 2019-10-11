package com.maker.connor;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maker.connor.dto.ScheduleDto;
import com.maker.connor.service.IScheduleService;

@Controller
public class ScheduleController {

	@Autowired
	private IScheduleService scheduleService;
	
	private static final Logger logger = LoggerFactory.getLogger(ScheduleController.class);
	
	@RequestMapping(value = "/eduList.do", method = RequestMethod.GET)
	public String eduList(Locale locale, Model model) {
		logger.info("교육 목록 보기 {}.", locale);
		List<ScheduleDto> list = scheduleService.getEduList();
		model.addAttribute("list", list);
		return "schedule/eduList";
	}
	
	
}
