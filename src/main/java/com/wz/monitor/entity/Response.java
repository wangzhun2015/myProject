package com.wz.monitor.entity;

import java.io.Serializable;

public class Response implements Serializable{
	private String code; // 1 成功  0失败
	private String text; //失败信息
	private Object target;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Object getTarget() {
		return target;
	}
	public void setTarget(Object target) {
		this.target = target;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Response(String code, String text, Object target) {
		super();
		this.code = code;
		this.text = text;
		this.target = target;
	}

	
}
