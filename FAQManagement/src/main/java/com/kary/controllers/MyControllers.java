package com.kary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kary.entitys.Classes;
import com.kary.entitys.Faqs;
import com.kary.services.ClassesService;
import com.kary.services.FaqsService;

@Controller
public class MyControllers {

	@Autowired
	private ClassesService cs;
	public ClassesService getCs() {
		return cs;
	}
	public void setCs(ClassesService cs) {
		this.cs = cs;
	}
	@Autowired
	private FaqsService fs;
	public FaqsService getFs() {
		return fs;
	}
	public void setFs(FaqsService fs) {
		this.fs = fs;
	}
	
	@RequestMapping("getFaps")
	public String findFaqs(ModelMap mp){
		System.out.println(fs.findAll());
		mp.put("faps", fs.findAll());
		
		return "index2";
	}
	@RequestMapping(value="add", method=RequestMethod.POST)
	public String addclasses(Classes c, Faqs d){
		c.setId(0);
		d.setId(0);
		fs.save(c, d);
		return "index2";
	}
	
	@RequestMapping(value="getcla", method=RequestMethod.GET)
	public String findcla(ModelMap mp){
		mp.put("cla", cs.findAll());
		return "index2";
	}
	@RequestMapping(value="search", method=RequestMethod.POST)
	public String search(ModelMap mp, String key){
		key = "%"+ key +"%";
		mp.put("scrs", fs.search(key));
		return "index2";
	}
	@RequestMapping(value="searchAll", method=RequestMethod.GET)
	public String search(ModelMap mp){
		mp.put("resu", fs.search("%"));
		return "index2";
	}
	
}
