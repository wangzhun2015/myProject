package com.wz.monitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.wz.monitor.dao.BasetDao;
import com.wz.monitor.entity.BaseEntity;
import com.wz.monitor.entity.Page;
@Transactional(readOnly = false)
public class BaseService <D extends BasetDao<T>, T extends BaseEntity<T>>  {
	@Autowired
	protected D d;
	
	public Page<T> findPage(T t){
		int total =  d.findTotalCount(t);
		List<T> datas = d.findList(t);
		Page<T> page = new Page<T>(); 
		page.setTotalRows(total);
		page.setDatas(datas);
		page.setCurrentPage(t.getCurrentPage());
		page.setPageSize(t.getPageSize());
		return page;
	}
	
	public List<T> findList(T t){
		return d.findList(t);
	}

}
