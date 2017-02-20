package com.kary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kary.bizs.StudentBiz;

@Controller
public class StudentController {

	@Autowired
	private StudentBiz a;
	
	@RequestMapping("findStu")
	public String find(ModelMap mp){
		//调用业务逻辑层
		mp.put("stus", a.findStudent());
		return "index";
	}
}
