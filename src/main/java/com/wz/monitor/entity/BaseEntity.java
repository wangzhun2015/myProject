package com.wz.monitor.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseEntity <T> implements Serializable {
private  String id;
private String createDate;
private String delFlag; // 1 删除  0 正常
@JsonIgnore
private String beginTime; //开始时间
@JsonIgnore
private String endTime;//结束时间
@JsonIgnore
private int currentPage=1;//当前页
@JsonIgnore
private int pageSize=20;
@JsonIgnore
private int beginRows;
@JsonIgnore
private int endRows;
@JsonIgnore
private int totalPage;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCreateDate() {
	return createDate;
}
public void setCreateDate(String createDate) {
	this.createDate = createDate;
}
public String getDelFlag() {
	return delFlag;
}
public void setDelFlag(String delFlag) {
	this.delFlag = delFlag;
}
public String getBeginTime() {
	return beginTime;
}
public void setBeginTime(String beginTime) {
	this.beginTime = beginTime;
}
public String getEndTime() {
	return endTime;
}
public void setEndTime(String endTime) {
	this.endTime = endTime;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getBeginRows() {
	
	return (currentPage-1)*pageSize;
}
public void setBeginRows(int beginRows) {
	this.beginRows = beginRows;
}
public int getEndRows() {
	return currentPage*pageSize;
}
public void setEndRows(int endRows) {
	this.endRows = endRows;
}
public int getTotalPage() {
	return totalPage;
}
public void setTotalPage(int totalPage) {
	this.totalPage = totalPage;
}

}
