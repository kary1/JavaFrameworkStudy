package com.sky.controllers;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sky.entitys.Stu;

@Controller
public class MyController {

	@RequestMapping(value="test", method=RequestMethod.GET)
	public String login(@Valid Stu stu, BindingResult result, HttpServletRequest req){
		Map<String, String> check = check(result);
		req.setAttribute("errfield", check);
		return "index";
	}
	public Map<String,String> check(BindingResult result){
		Map<String,String> err = new HashMap<>();
		if (result.hasErrors()) {
			List<FieldError> list = result.getFieldErrors();
			FieldError error = null;
			for (int i = 0; i < list.size(); i++) {
				error = list.get(i);
				err.put(error.getField(), error.getDefaultMessage());
			}
		}
		return err;
	}
	
	@RequestMapping(value="setdate", method=RequestMethod.POST)
	public String ChangeClass (HttpServletRequest req, Stu source){

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df.format(source.getDate()));
		System.out.println(source.getName());
		req.setAttribute("point", source);
		return "index";
	}
}
