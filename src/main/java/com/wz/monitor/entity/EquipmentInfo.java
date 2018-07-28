package com.wz.monitor.entity;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

public class EquipmentInfo implements Serializable {
private String id;
private String equipmentName;//设备名称
private String equipmentNum;//设备编号
private String ip;
private String port;
private String open;// 是否开启  1  开启  0关闭
private String openStr;
private String  status; // 1已连接    2 未连接
private String statusStr;
private String threadId;//线程id
private String type;// 1 伦奇线   2 sqllite线  3 其他线
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
public String getEquipmentNum() {
	return equipmentNum;
}
public void setEquipmentNum(String equipmentNum) {
	this.equipmentNum = equipmentNum;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public String getPort() {
	return port;
}
public void setPort(String port) {
	this.port = port;
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
public String getOpen() {
	return open;
}
public void setOpen(String open) {
	this.open = open;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getThreadId() {
	return threadId;
}
public void setThreadId(String threadId) {
	this.threadId = threadId;
}
public String getOpenStr() {
	return "1".equals(open)?"开启":"关闭";
}
public void setOpenStr(String openStr) {
	this.openStr = openStr;
}
public String getStatusStr() {
	return "1".equals(status)?"已连接":"未连接";
}
public void setStatusStr(String statusStr) {
	this.statusStr = statusStr;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}



}
