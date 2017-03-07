package com.hw.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 6844331179143382455L;

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		HttpSession session = ServletActionContext.getRequest().getSession();
		
		if(session.getAttribute("username")==null){
			return "login";
		}
		
		return ai.invoke();
	}

}
