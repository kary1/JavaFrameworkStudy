package com.sky.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value="testException", method=RequestMethod.POST)
	public ModelAndView testException(@RequestParam("id") int i ){
		System.out.println(10/i);
		return new ModelAndView("show");
	}
	
	/*//非Restful风格
	@RequestMapping(value="stu", method=RequestMethod.GET)
	public String getData(@RequestParam("pid") Integer a,@RequestParam("id") Integer b){
//		System.out.println(a+":"+b);
		return "index";//逻辑视图名
	}*/
}
