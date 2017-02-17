package com.sky.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static Connection conn;
	private static ConnectionFactory cf;
	private ConnectionFactory(){
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		} catch (SQLException e) {
			System.out.println("连接失败");
			e.printStackTrace();
		}
	}
	public static synchronized ConnectionFactory getInstance(){
		if (cf == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("驱动加载失败");
				e.printStackTrace();
			}
			cf = new ConnectionFactory();
		}
		return cf;
	}
	
	public Connection getConnection(){
		return conn;
	}
	
	public void closeConnection() throws SQLException{
		conn.close();
	}
}
