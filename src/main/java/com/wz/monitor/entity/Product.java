package com.wz.monitor.entity;

import java.io.Serializable;

public class Product extends BaseEntity<Product> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;//产品名称
	private String sort;//产品排序
	private String saleNumber; //已销售的数量
	private String totalNumber; //总数量
	private String price;//价格
	private String url;//主要的图片
	private String introduction; // 产品介绍
	private String moreUrl;//更多的图片  用#分割
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSaleNumber() {
		return saleNumber;
	}
	public void setSaleNumber(String saleNumber) {
		this.saleNumber = saleNumber;
	}
	public String getTotalNumber() {
		return totalNumber;
	}
	public void setTotalNumber(String totalNumber) {
		this.totalNumber = totalNumber;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getMoreUrl() {
		return moreUrl;
	}
	public void setMoreUrl(String moreUrl) {
		this.moreUrl = moreUrl;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
