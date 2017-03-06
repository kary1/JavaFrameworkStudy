package com.sky.dao;

import java.sql.SQLException;

import com.sky.entitys.User;

public interface UserDao {

	public boolean insert(User user)throws SQLException;
}
