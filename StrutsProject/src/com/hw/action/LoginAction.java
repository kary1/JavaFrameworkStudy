package com.hw.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.hw.dao.UserDao;
import com.hw.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ServletRequestAware,ModelDriven{

	private static final long serialVersionUID = -1235343842835091977L;

	private HttpServletRequest request;
	
	//ͨ�����Ի�ȡ����
	private String username;
	private String password;
	private String email;
	//ͨ��JavaBean��ȡ����01
	private User user = new User();
	
	/**
	 * ��½
	 * @return
	 */
	public String login(){
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if("admin".equals(username)){
			if("123456".equals(password)){
				HttpSession session = ServletActionContext.getRequest().getSession();
				session.setAttribute("username", username);
				return SUCCESS;
			}
			request.setAttribute("tips", "��������");
		}
		
		return "fail";
	}
	
	/**
	 * ע��
	 * @return
	 */
	public String register(){
		HttpServletRequest request1 = ServletActionContext.getRequest();
		
		UserDao userDao = new com.hw.dao.impl.UserDaoImpl();
		User user = new User(username, password, email);
		try {
			userDao.insert(user);
		} catch (SQLException e) {
			e.printStackTrace();
			return ERROR;
		}
		
		return "login";
	}
	
	public String register2(){
		
		System.out.println(user);
		
		return "login";
	}

	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Object getModel() {
		
		return user;
	}
}
