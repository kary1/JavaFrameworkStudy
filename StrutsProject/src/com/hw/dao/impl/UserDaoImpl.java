package com.hw.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hw.dao.UserDao;
import com.hw.entity.User;
import com.hw.util.DBUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean insert(User user) throws SQLException {
		String sql = "insert into user(username,password,email) values(?,?,?)";
		
		Connection conn = DBUtils.getConn();
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		
		return ps.executeUpdate()!=0;
	}

}
