package com.wz.monitor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wz.monitor.entity.HmeAirtightData;
import com.wz.monitor.entity.Page;
import com.wz.monitor.entity.Response;
import com.wz.monitor.service.HmeAirtightDataService;

@Controller
@RequestMapping("/airData")
public class HmeAirtightDataController extends BaseController{
@Autowired
private HmeAirtightDataService service;
@RequestMapping(value="/list")
@ResponseBody
public Object getData(HmeAirtightData entity) {
	//entity.setEndTime("2018-01-04");
	Page<HmeAirtightData> pages = 	service.findList(entity);
	List<HmeAirtightData>  LS = pages.getDatas();
	for(HmeAirtightData h:LS){
		System.out.println(h.getCollectTime());
	}
	return new Response(SUCCESS_CODE,null,pages);
}
}
