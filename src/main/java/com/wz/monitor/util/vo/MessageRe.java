package com.wz.monitor.util.vo;

import java.io.Serializable;

import com.wz.monitor.entity.Page;
import com.wz.monitor.entity.Product;

public class MessageRe<T> implements Serializable {

	private String code; // 1 成功  0失败
	private String text; //失败信息 没有则为null
	private Page<T>  target;//数据
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Page<T> getTarget() {
		return target;
	}
	public void setTarget(Page<T> target) {
		this.target = target;
	}
	public MessageRe(String code, String text, Page<T> target) {
		super();
		this.code = code;
		this.text = text;
		this.target = target;
	}
	

	

	

}