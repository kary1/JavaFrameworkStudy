package com.hw.action;

import com.opensymphony.xwork2.ActionSupport;

public class Hello01Action extends ActionSupport {

	private static final long serialVersionUID = 6181690433348291395L;

	@Override
	public String execute() throws Exception {
		
		System.out.println("hello Struts£¡");
		
		return SUCCESS;
	}

	
}
