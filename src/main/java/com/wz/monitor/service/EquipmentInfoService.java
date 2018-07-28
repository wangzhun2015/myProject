package com.wz.monitor.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.monitor.dao.EquipmentInfoDao;
import com.wz.monitor.entity.EquipmentInfo;
@Service
public class EquipmentInfoService {
	@Autowired
	private EquipmentInfoDao dao;
	public List<EquipmentInfo> findList(EquipmentInfo entity){
		return dao.findList(entity);
	}
		
	public EquipmentInfo findByCode(String code){
		return dao.findByCode(code);
	}
	public EquipmentInfo findById(int id){
		return dao.findById(id);
	}
	public EquipmentInfo findByThreadId(String threadId){
		return dao.findByThreadId(threadId);
	}
	public void insert(EquipmentInfo entity){
		if(StringUtils.isEmpty(entity.getId())){
			entity.setId("0");
		}
		dao.insert(entity);
	}
	public void update(EquipmentInfo entity){
		dao.update(entity);
	}
	public void delete(EquipmentInfo entity){
		dao.delete(entity);
		
	}
}
