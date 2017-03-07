package com.hw.dao;

import java.sql.SQLException;

import com.hw.entity.User;

public interface UserDao {

	public boolean insert(User user) throws SQLException;
}
