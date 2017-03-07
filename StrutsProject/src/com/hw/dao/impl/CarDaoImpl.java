package com.hw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hw.dao.CarDao;
import com.hw.entity.Car;
import com.hw.util.DBUtils;

public class CarDaoImpl implements CarDao{

	@Override
	public boolean insert(Car car) throws SQLException {
		
		String sql = "insert into car(name,type,color) values(?,?,?)";
		
		Connection conn = DBUtils.getConn();
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, car.getName());
		ps.setString(2, car.getType());
		ps.setString(3, car.getColor());
		
		return ps.executeUpdate()!=0;
	}

	@Override
	public List<Car> query() throws SQLException {
		String sql = "select name,type,color from car ";
		Connection conn = DBUtils.getConn();
		
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		
		List<Car> list = new ArrayList<Car>();
		Car car = null;
		while(rs.next()){
			car = new Car();
			car.setName(rs.getString("name"));
			car.setType(rs.getString("type"));
			car.setColor(rs.getString("color"));
			list.add(car);
		}

		return list;
	}

}
