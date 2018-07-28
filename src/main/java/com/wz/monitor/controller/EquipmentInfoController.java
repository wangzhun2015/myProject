package com.wz.monitor.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wz.monitor.entity.EquipmentInfo;
import com.wz.monitor.entity.Response;
import com.wz.monitor.service.EquipmentInfoService;
import com.wz.monitor.util.CacheUtils;
import com.wz.monitor.util.ThreadUtil;

@Controller
@RequestMapping("/equipmentInfo")
public class EquipmentInfoController extends BaseController {
	@Autowired
	private EquipmentInfoService service;
	
	
	@RequestMapping("/list")
	@ResponseBody
	public Object getData(EquipmentInfo entity) {
		
		return new Response(SUCCESS_CODE,null,service.findList(entity));
	}
	@RequestMapping("/add")
	@ResponseBody
	public Object addData(EquipmentInfo entity) {
		
		 service.insert(entity);
		/* if("1".equals(entity.getOpen())){
			 //如果设备为开启状态 则启动对应的连接
			 SocekThread thread=new SocekThread(entity.getIp(),Integer.parseInt(entity.getPort()),Integer.parseInt(entity.getId()) );
			 thread.start();
		 }*/
		 
		  return new Response(SUCCESS_CODE,null,null);
	}
	@RequestMapping("/update")
	@ResponseBody
	public Object updateData(EquipmentInfo entity) {
		EquipmentInfo oldInfo = service.findById(Integer.parseInt(entity.getId()) );
		service.update(entity);
		if(StringUtils.isNotEmpty(oldInfo.getThreadId())){
			ThreadUtil.interruptThread(Integer.parseInt(oldInfo.getThreadId()));
		}
		return new Response(SUCCESS_CODE,null,null);
	}
	
	@RequestMapping("/getBarCode")
	@ResponseBody
	public Object getBarCode(){
		String barCode =  (String) CacheUtils.get("system_barCode");
		if(StringUtils.isEmpty(barCode)){
			return null;
		}else{
			CacheUtils.remove("system_barCode");
			return barCode;
		}
	}
}
