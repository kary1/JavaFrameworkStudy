package com.sky.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	private static String url = "jdbc:mysql://localhost:3306/test";
	private static String user = "root";
	private static String pwd = "root";
	private static Connection conn;
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		if (conn == null || conn.isClosed()) {
			conn = DriverManager.getConnection(url, user, pwd);
		}
		return conn;
	}
}
