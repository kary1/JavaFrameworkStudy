package com.sky.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sky.entity.Stu;
import com.sky.entity.TeacherList;


@Controller
//注解的方式需要添加注释   以便可以扫描到这个类
public class HelloWorldController {
	
	private List<String>  stringList = new ArrayList<>();
	
	//用注解的方法在页面显示Hello,World!--方法重载 get请求
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest req , HttpServletResponse resp, ModelMap modelmap) throws Exception {
		modelmap.put("welcome", "Hello,World!");
		return new ModelAndView("show", modelmap);
	}
	
	//用注解的方法在页面显示Hello,World!--方法重载 post请求
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public ModelAndView welcome(ModelMap modelmap) throws Exception {
		modelmap.put("welcome", "Hello,hahaha!");
		ModelAndView mav = new ModelAndView("show");
		mav.addObject(modelmap);
		return mav;
	}
	
	//从页面传参(传对象)   返回值 void 表示进口就是出口，需要添加试图解析器解决死循环问题
	@RequestMapping(value="show", method=RequestMethod.POST)
	public void welcome(Stu stu) throws Exception {
		System.out.println(stu);
	}
	
	//从页面传参(传集合)
	@RequestMapping(value="/list", method=RequestMethod.POST)
	public ModelAndView getlist(TeacherList tlist){
		System.out.println(tlist);
 		return new ModelAndView("show");
	}
	
	
	//使用注解的方式传参value对应页面上控件的name属性 required=true表示没有传参报400错误
	@RequestMapping(value="wel", method=RequestMethod.GET)
	public ModelAndView wel(@RequestParam(value="id", required=true)String p1, ModelMap modelmap) throws Exception {
		modelmap.addAttribute("id", p1);
		System.out.println(p1);
		return new ModelAndView("show", modelmap);
	}
	
	//使用@ModelAttribute修饰方法来回传给页面数据
	//请求过来之后此方法会先于所有的处理方法执行、任何请求过来都会先执行这个方法
    @ModelAttribute("stringList")
	public List<String> getStringlist(){
		return stringList;
	}
    //返回值String 为要返回页面的逻辑视图名
	@RequestMapping("setList")
	public String setList(){
		stringList.add("1111");
		stringList.add("2");
		stringList.add("san");
		stringList.add("张三");
		return "show";
	} 
	
	
	//使用@ModelAttribute修饰返回值来回传给页面数据  返回页面类似返回值为void的情况
	@RequestMapping(value="index", method=RequestMethod.GET)
	public @ModelAttribute("stringList")List<String> getString(){
		List<String>  strList = new ArrayList<>();
		strList.add("rrr");
		strList.add("1");
		strList.add("san");
		strList.add("李四");
		return strList;
	}
	
	
	//使用@ModelAttribute修饰形参 从域中查找相应数据类型的数据进行注入
	@RequestMapping("/print")
	public String print(@ModelAttribute List<String> list){
		list.size();
		System.out.println(list);
		return "index";
	}
	/*
	参数传入
	  1.传基本数据类型 (形参用包装类)
	  2.传自定义类型
	  3.传复杂类型(自定义类型包含是自定义数据类型的属性)
	  4.传集合(创建类-包含要传集合的属性)
	  5.注解传参(只能传基本数据类型)
	处理结果传出
	  1.Request和Session的setAtrribute()
	  2.ModelAndView
	  3.ModelMap
	  4@ModelAttribute
	返回页面的方式
	  1.return ModelAndView
	  2.return null
	  3.return String
	*/
}
