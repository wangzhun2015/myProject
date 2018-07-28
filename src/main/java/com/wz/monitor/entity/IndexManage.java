package com.wz.monitor.entity;

import java.io.Serializable;
/**
 * 图片管理
 * @author wangzhun
 *
 */
public class IndexManage extends BaseEntity<IndexManage> implements Serializable{
private String name;
private String type;// 1 首页图片  2产品文化介绍 3公司文化介绍
private String text;//文字介绍
private String sort;//排序
private String url; //路径
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public String getSort() {
	return sort;
}
public void setSort(String sort) {
	this.sort = sort;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}




}
