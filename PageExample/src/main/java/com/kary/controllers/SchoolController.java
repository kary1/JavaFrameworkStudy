package com.kary.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kary.services.SchooleBiz;

@Controller
public class SchoolController {
	@Autowired
	private SchooleBiz sb;
	Integer row = 1;
	@RequestMapping(value="show",method=RequestMethod.GET)
	public String showStudentByPage(ModelMap mp, HttpSession se,Integer row){
		if (row == null) {
			row = 1;
		}else{
			setRow(row);
		}
		mp.put("stus", sb.findStudentByPage(1, row));
		mp.put("currentPage", 1);
		se.setAttribute("totalpage", sb.findStudentTotalpage(row));
		return "index";
	}
	public void setRow(Integer row){
		this.row = row;
	}
	@RequestMapping(value="queryByPage",method=RequestMethod.GET)
	public String queryByPage(int currentPage,ModelMap mp){
		String path = "index";
		mp.put("stus", sb.findStudentByPage(currentPage,row));
		mp.put("currentPage", currentPage);
		return path;
	}
	
}
