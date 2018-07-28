package com.wz.monitor.entity;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {
private int totalRows;
private int pageSize;
private int currentPage;
List<T> datas;
public int getTotalRows() {
	return totalRows;
}
public void setTotalRows(int totalRows) {
	this.totalRows = totalRows;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
public int getCurrentPage() {
	return currentPage;
}
public void setCurrentPage(int currentPage) {
	this.currentPage = currentPage;
}
public List<T> getDatas() {
	return datas;
}
public void setDatas(List<T> datas) {
	this.datas = datas;
}



}
