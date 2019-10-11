package com.maker.connor.dao;

import java.util.List;

import com.maker.connor.dto.ScheduleDto;

public interface IScheduleDao {
	
	//교육 목록 보기
	public List<ScheduleDto> getEduList();
	//아르바이트 목록 보기
	public List<ScheduleDto> getPartList();
	//휴식 목록 보기
	public List<ScheduleDto> getFreeList();
}
