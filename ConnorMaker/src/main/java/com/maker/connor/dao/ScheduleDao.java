package com.maker.connor.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.maker.connor.dto.ScheduleDto;

@Repository
public class ScheduleDao implements IScheduleDao {
	
	private String namespace = "Sche.";
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<ScheduleDto> getEduList() {
		return sqlSession.selectList(namespace + "getEduList");
	}

	@Override
	public List<ScheduleDto> getPartList() {
		return sqlSession.selectList(namespace + "getPardList");
	}

	@Override
	public List<ScheduleDto> getFreeList() {
		return sqlSession.selectList(namespace + "getFreList");
	}

}
