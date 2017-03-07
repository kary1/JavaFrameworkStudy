package com.hw.action;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hw.dao.CarDao;
import com.hw.dao.impl.CarDaoImpl;
import com.hw.entity.Car;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CarAction extends ActionSupport implements ModelDriven<Car>{

	private static final long serialVersionUID = -3688176375113477095L;
	
	private Car car = new Car();
	private CarDao carDao = new CarDaoImpl();

	public String add(){
		
		try {
			carDao.insert(car);
		} catch (SQLException e) {
			e.printStackTrace();
			return "error";
		}
		
		return "add_show";
	}
	
	public String query() throws SQLException{
		List<Car> list = carDao.query();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println("≤‚ ‘÷ÿ∂®œÚ£∫"+request.getParameter("name"));
		request.setAttribute("list", list);
		
		return "show";
	}

	@Override
	public Car getModel() {
		
		return car;
	}
}
