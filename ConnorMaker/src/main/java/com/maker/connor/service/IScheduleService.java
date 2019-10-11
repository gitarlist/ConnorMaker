package com.maker.connor.service;

import java.util.List;

import com.maker.connor.dto.ScheduleDto;

public interface IScheduleService {

	//교육 목록 보기
	public List<ScheduleDto> getEduList();
	//아르바이트 목록 보기
	public List<ScheduleDto> getPartList();
	//휴식 목록 보기
	public List<ScheduleDto> getFreeList();
}
