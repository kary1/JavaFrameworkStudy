package com.kary.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kary.entitys.Informations;
import com.kary.entitys.Replies;
import com.kary.services.InfoService;
import com.kary.services.ReplyService;

@Controller
public class MyController {

	@Autowired
	private InfoService is;
	public InfoService getIs() {
		return is;
	}
	public void setIs(InfoService is) {
		this.is = is;
	}
	@Autowired
	private ReplyService rs;
	public ReplyService getRs() {
		return rs;
	}
	public void setIs(ReplyService rs) {
		this.rs = rs;
	}

	@RequestMapping(value="addInfo", method=RequestMethod.POST)
	public String addInfo(Informations info){
		is.addInfo(info);
		return "index";
	}
	
	@RequestMapping(value="showAll", method=RequestMethod.GET)
	public String showAll(ModelMap mp){
		mp.put("infoList", is.showAll());
		return "index";
	}
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public String seeDetail(ModelMap mp, Integer id){
		mp.put("info", is.getById(id));
		mp.put("repList", rs.getByInfoId(id));
		return "detail";
	}
	@RequestMapping(value="addReply", method=RequestMethod.POST)
	@ResponseBody
	public Replies add(ModelMap mp, Integer id, @RequestParam("content")String content){
		Replies rep = null;
		rep = rs.save(new Replies(content, id));
		return rep;
	}
	
}
