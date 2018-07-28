package com.bskj.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wz.monitor.util.vo.Data;
import com.wz.monitor.util.vo.JsonRootBean;

public class Test3 {
	public static void main(String args[]){
		 String returnStr = "{\"data\":[{\"scanCode\":\"1\",\"Airtight\":\"1\",\"PrintCode\":\"1\"},{\"scanCode\":\"2\",\"Airtight\":\"2\",\"PrintCode\":\"2\"},{\"scanCode\":\"3\",\"Airtight\":\"3\",\"PrintCode\":\"3\"}]}";
		 JsonRootBean p1=JSONObject.parseObject(returnStr, JsonRootBean.class);   
	for(Data d:p1.getData()){
		System.out.println(d.getAirtight());
	}
	}
}
