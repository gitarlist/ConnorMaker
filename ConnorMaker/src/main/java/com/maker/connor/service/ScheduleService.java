package com.maker.connor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maker.connor.dao.IScheduleDao;
import com.maker.connor.dto.ScheduleDto;

@Service
public class ScheduleService implements IScheduleService {

	@Autowired
	private IScheduleDao scheduleDao;
	
	@Override
	public List<ScheduleDto> getEduList() {
		return scheduleDao.getEduList();
	}

	@Override
	public List<ScheduleDto> getPartList() {
		return scheduleDao.getPartList();
	}

	@Override
	public List<ScheduleDto> getFreeList() {
		return scheduleDao.getFreeList();
	}

}
