package com.wz.monitor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wz.monitor.entity.Product;
import com.wz.monitor.service.ProductService;
import com.wz.monitor.util.vo.MessageRe;

@Controller
@RequestMapping("/product")
public class ProductController extends BaseController {
	
	@Value("${product.name}")
	private String testvalue;
	
@Autowired
private ProductService service;

@RequestMapping("/list")
@ResponseBody
public Object getData(Product entity){
	System.out.println(testvalue);
	return new MessageRe(SUCCESS_CODE, "", service.findPage(entity)); 
}
	
}
