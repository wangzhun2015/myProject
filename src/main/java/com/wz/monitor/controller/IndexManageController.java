package com.wz.monitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wz.monitor.entity.IndexManage;
import com.wz.monitor.service.IndexManageService;
import com.wz.monitor.util.vo.MessageRe;

@Controller
@RequestMapping("/indexMng")
public class IndexManageController extends BaseController {
	@Autowired
	private IndexManageService service;
	
	@RequestMapping("/list")
	@ResponseBody
	public Object   getData(IndexManage entity){
		return new MessageRe(SUCCESS_CODE, "", service.findList(entity)); 
	}
	
	
}
