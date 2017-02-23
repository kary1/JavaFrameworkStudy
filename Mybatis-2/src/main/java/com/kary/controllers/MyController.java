package com.kary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kary.entitys.Student;
import com.kary.service.StudentService;

@Controller
public class MyController {

	@Autowired
	private StudentService ss;
	public void setSs(StudentService ss) {
		this.ss = ss;
	}

	@RequestMapping(value="addStu", method=RequestMethod.POST)
	public String save(Student stu){
		ss.saveStu(stu);
		return "index";
	}
}
