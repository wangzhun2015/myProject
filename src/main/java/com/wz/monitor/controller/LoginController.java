package com.wz.monitor.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {
	@RequestMapping("/index")
	public String init(){
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response,Model model){
		return "indexAdmin";
	}
}
