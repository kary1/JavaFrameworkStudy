package com.hw.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private static final long serialVersionUID = -7941053808009616649L;
	
	@Override
	public String execute() throws Exception {
		
		System.out.println("execute...");
		
//		return SUCCESS;
		return "err";
	}

	
}
