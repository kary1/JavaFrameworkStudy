package com.sky.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.entity.Stu;
import com.sky.service.StuServiceImpl;

@Controller
public class RestfulDemo {

	StuServiceImpl ssi = new StuServiceImpl();
	
	@RequestMapping(value="stu/{id}/{pid}", method=RequestMethod.GET)
	@ResponseBody//(把返回值作为响应体对待，不作为逻辑视图名)
	public String getData(@PathVariable("pid") Integer a,@PathVariable("id") Integer b){
		return "{\"id\": 3}";
	}
	
	@RequestMapping(value="stu", method=RequestMethod.POST)
	@ResponseBody
	public List<Stu> getStu(){
		List<Stu> list = new ArrayList<>();
		list.add(new Stu(1, 10, "李四"));
		list.add(new Stu(2, 10, "李四"));
		list.add(new Stu(3, 10, "李四"));
		return list;
	}
	
	@RequestMapping(value="showAll", method=RequestMethod.GET)
	@ResponseBody
	public List<Stu> findAll(){
		List<Stu> list = null;
		list = ssi.findAll();
		return list;
	}
	
	@RequestMapping(value="add", method=RequestMethod.POST)
	@ResponseBody
	public int addOne(Stu stu){
		int row = 0;
		row = ssi.add(stu);
		return row;
	}
}
