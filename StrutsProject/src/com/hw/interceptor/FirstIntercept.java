package com.hw.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class FirstIntercept implements Interceptor {

	private static final long serialVersionUID = 436420031947511612L;

	@Override
	public void destroy() {
		System.out.println("destroy...");
	}

	@Override
	public void init() {
		System.out.println("init...");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		HttpSession request1 = ServletActionContext.getRequest().getSession();
		System.out.println("start..");
		ai.invoke();	//·ÅÐÐ
		System.out.println("end...");
		return null;
	}
}
