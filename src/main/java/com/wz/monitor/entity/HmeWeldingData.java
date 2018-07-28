package com.wz.monitor.entity;

import java.io.Serializable;
import java.util.Date;

public class HmeWeldingData implements Serializable{
	private String id;
	private String equipmentName;//设备名
	private String scanCode;//扫描条码
	private String barcode;//单品条码
	private String weldingType;//焊接类型
	private String electricityValue;//电流
	private String voltageValue;//电压
	private Date collectTime;//采集时间
	private String attribute1;
	private String attribute2;
	private String attribute3;
	private String attribute4;
	private String attribute5;
	
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
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getWeldingType() {
		return weldingType;
	}
	public void setWeldingType(String weldingType) {
		this.weldingType = weldingType;
	}
	public String getElectricityValue() {
		return electricityValue;
	}
	public void setElectricityValue(String electricityValue) {
		this.electricityValue = electricityValue;
	}
	public String getVoltageValue() {
		return voltageValue;
	}
	public void setVoltageValue(String voltageValue) {
		this.voltageValue = voltageValue;
	}
	public Date getCollectTime() {
		return collectTime;
	}
	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
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
	public String getAttribute4() {
		return attribute4;
	}
	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}
	public String getAttribute5() {
		return attribute5;
	}
	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

}
