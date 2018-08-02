package com.wz.monitor.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wz.monitor.util.CacheUtils;
import com.wz.monitor.util.JsonMapper;
import com.wz.monitor.util.vo.MessageRe;

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
	
	@RequestMapping(value = "/login",method = RequestMethod.POST , produces = "application/json;charset=utf-8")
	@ResponseBody
	public Object loginSubmit(String userName, String passWord, ModelMap model) {
		Map<String,String> parameters = new HashMap<String,String>();
		parameters.put("username", userName);
		parameters.put("password", passWord);
		parameters.put("syscode", "beerper");
	
		Subject curUser = SecurityUtils.getSubject();
		UsernamePasswordToken token;
		token = new UsernamePasswordToken(userName,
				passWord);
			try {
				curUser.login(token);
				Session session = curUser.getSession();
				session.setAttribute("username", userName);
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("autStr", CacheUtils.get("authStr"+userName));
			//	map.put("menuRootId", (String)CacheUtils.get("menuRootId"+userName));
				map.put("JSESSIONID", curUser.getSession().getId().toString());
				//loginInfo.setSessionId(curUser.getSession().getId().toString());
				return new MessageRe(SUCCESS_CODE, null,JsonMapper.toJsonString(map));
				// 根据角色判断返回的首页
			} catch (AuthenticationException e) {
				e.printStackTrace();
				return new MessageRe(ERROR_CODE, "用户名或者密码错误", null);
			}
		
	}
}
