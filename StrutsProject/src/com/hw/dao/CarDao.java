package com.hw.dao;

import java.sql.SQLException;
import java.util.List;

import com.hw.entity.Car;

public interface CarDao {

	public boolean insert(Car car) throws SQLException;
	
	public List<Car> query() throws SQLException;
}
