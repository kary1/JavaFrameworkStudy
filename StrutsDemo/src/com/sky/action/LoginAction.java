package com.sky.action;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sky.dao.UserDao;
import com.sky.dao.UserDaoImpl;
import com.sky.entitys.User;

public class LoginAction extends ActionSupport implements ServletRequestAware,ModelDriven<User> {

	private static final long serialVersionUID = 8682636118021089831L;

	private HttpServletRequest req;
	
	//�������Բ����set���� ��ȡ����
	private String name;
	private String pwd;
	private String email;
	//ͨ��JavaBean��ȡ����
	private User user = new User();
	
	/**
	 * ��¼
	 * @return
	 */
	public String login() {
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		if (name.equals("admin")) {
			if (pwd.equals("123456")) {
				return SUCCESS;
			}
		}
		return "failed";
	}
	
	/**
	 * ע��
	 * @return
	 */
	public String register(){
		UserDao ud = new UserDaoImpl();
		User user  = new User(name, pwd, email);
		
		try {
			ud.insert(user);
		} catch (SQLException e) {
			e.printStackTrace();
			return "error";
		}
		return "login";
	}

	
	/**
	 * �������ݽ��ղ���
	 * @return
	 */
	public String register2(){
		
		System.out.println(user);
		return "login";
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		req = arg0;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setEmail(String eamil) {
		this.email = eamil;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	@Override
	public User getModel() {
		
		return user;
	}

	

}
