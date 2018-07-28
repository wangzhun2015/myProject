package com.wz.monitor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wz.monitor.entity.EquipmentInfo;

@Mapper
public interface EquipmentInfoDao {
public List<EquipmentInfo> findList(EquipmentInfo entity);
public EquipmentInfo findByCode(String code);
public EquipmentInfo findById(int id);
public EquipmentInfo findByThreadId(String threadId);
public void insert(EquipmentInfo entity);
public void update(EquipmentInfo entity);
public void delete(EquipmentInfo entity);
}
