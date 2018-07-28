package com.wz.monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wz.monitor.entity.IndexManage;
import com.wz.monitor.util.vo.MessageRe;

@Controller
@RequestMapping("/index")
public class IndexManageController extends BaseController {
	@RequestMapping("/getData")
	public Object   getData(IndexManage entity){
		return new MessageRe(SUCCESS_CODE, "", null); 
	}
	
	
}
