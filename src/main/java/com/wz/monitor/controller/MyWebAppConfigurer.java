package com.wz.monitor.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter {
	/**
	 * 设置静态访问的资源
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("classpath:/airTightManage/");
		// String localUrl = System.getProperty("user.dir").replace("\\", "/");
	}


	    @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	       // registry.addViewController("/").setViewName("forward:/login/index");
	        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	        super.addViewControllers(registry);
	    } 
}