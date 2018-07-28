package com.wz.monitor.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class HmeAirtightData extends BaseEntity implements Serializable {
	private String id;//
	private String equipmentName;//设备名
	private String scanCode;//扫描条码
	private String barCode;//单品条码
	private String collectTime;//采集时间 collect_time
	private String airtightValue;//气密值airtight_value
	private String attribute1;//预留字段1
	private String attribute2;//预留字段2
	private String attribute3;//预留字段3
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEquipmentName() {
		return equipmentName;
	}
	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}
	public String getScanCode() {
		return scanCode;
	}
	public void setScanCode(String scanCode) {
		this.scanCode = scanCode;
	}
	
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	
	public String getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}
	public String getAirtightValue() {
		return airtightValue;
	}
	public void setAirtightValue(String airtightValue) {
		this.airtightValue = airtightValue;
	}
	public String getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	public String getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	public String getAttribute3() {
		return attribute3;
	}
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}
	
	
	

}
