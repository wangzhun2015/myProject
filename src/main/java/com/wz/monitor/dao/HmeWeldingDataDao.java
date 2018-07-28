package com.wz.monitor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wz.monitor.entity.HmeWeldingData;

@Mapper
public interface HmeWeldingDataDao {
	public List<HmeWeldingData> findList(HmeWeldingData entity);
	public HmeWeldingData findByCode(String code);
	public void insert(HmeWeldingData entity);
	public void update(HmeWeldingData entity);
	public void delete(HmeWeldingData entity);
}
