package com.wz.monitor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wz.monitor.entity.HmeAirtightData;

@Mapper
public interface HmeAirtightDataDao {
	public List<HmeAirtightData> findList(HmeAirtightData entity);
	public HmeAirtightData findByCode(String code);
	public void insert(HmeAirtightData entity);
	public void update(HmeAirtightData entity);
	public void delete(HmeAirtightData entity);
	public int findTotalCount(HmeAirtightData entity);
	
}
