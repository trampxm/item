package com.tramp.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tramp.item.bean.ConfDemo;

@RestController
public class HelloController {
	
	@Autowired
	private ConfDemo conf;
	
	@RequestMapping("/hello")
	public ConfDemo helloWorld() {
		System.out.println(conf.toString());
		
		// 不能直接return conf ,因为该对象时代理对象，里边有一些ConfDemo没有的属性，在进行json转换的时候会出现错误
		// No serializer found for class org.springframework.context.expression.StandardBeanExpressionResolver and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.
		ConfDemo demo = new ConfDemo();
		demo.setUrl(conf.getUrl());
		demo.setName(conf.getName());
		demo.setPwd(conf.getPwd());
		int i = 1 / 0;
		return demo;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("name", "index");
		return mv;
	}
	
	

}
