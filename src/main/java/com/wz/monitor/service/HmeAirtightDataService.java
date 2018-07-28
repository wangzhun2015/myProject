package com.wz.monitor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.monitor.dao.HmeAirtightDataDao;
import com.wz.monitor.entity.HmeAirtightData;
import com.wz.monitor.entity.Page;

@Service
public class HmeAirtightDataService {
	@Autowired
	private HmeAirtightDataDao dao;
	public Page<HmeAirtightData> findList(HmeAirtightData entity){
		Page<HmeAirtightData> page = new Page<HmeAirtightData>();
		page.setDatas(dao.findList(entity));
		page.setCurrentPage(entity.getCurrentPage());
		page.setTotalRows(dao.findTotalCount(entity));
		page.setPageSize(entity.getPageSize());
		return page;
	}
	public HmeAirtightData findByCode(String code){
		return dao.findByCode(code);
	}
	public void insert(HmeAirtightData entity){
		dao.insert(entity);
	}
	public void update(HmeAirtightData entity){
		dao.update(entity);
	}
	public void delete(HmeAirtightData entity){
		dao.delete(entity);
		
	}
}
