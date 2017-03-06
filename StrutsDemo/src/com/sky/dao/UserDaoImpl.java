package com.sky.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sky.entitys.User;
import com.sky.util.DBUtils;

public class UserDaoImpl implements UserDao {

	
	public static void main(String[] args) {
		Map<String, String> map1= new HashMap<String, String>();
		System.out.println(map1.hashCode());
		map1.put("a", "1");
		map1.put("b", "2");
		map1.put("c", "3");
		Map<String, String> map2= new HashMap<String, String>();
		System.out.println(map2.hashCode());
		map2.put("b", "2");
		map2.put("a", "1");
		map2.put("c", "3");
		System.out.println(map1);
		
	}
	@Override
	public boolean insert(final User user) throws SQLException {
		
		String sql = "insert into user(username,pwd,email) values(?,?,?)";
		Connection conn = DBUtils.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPwd());
		ps.setString(3, user.getEmail());
		return ps.executeUpdate() != 0;
	}

}
