package com.sky.jdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JDBCTemplate<T> {

	public int update(PrepareStatementSetter setter,String sql) throws SQLException{

		int row = 0;
		Connection conn = ConnectionFactory.getInstance().getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		if (setter != null) {
			setter.setter(ps);
		}
		row = ps.executeUpdate();
		return row;
	}
	
	public List<T> query(Class<T> t, PrepareStatementSetter setter,String sql) throws Exception{
		List<T> list = new ArrayList<>();
		Connection conn = ConnectionFactory.getInstance().getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		if (setter != null) {
			setter.setter(ps);
		}
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Field[] fields = t.getDeclaredFields();
			T ins = t.newInstance();//获得实例
			for (int i = 0; i < fields.length; i++) {
				fields[i].setAccessible(true);
				String filedName = fields[i].getName();//获得属性名
				String fieldTypeName = fields[i].getType().getSimpleName();//获得属性的类型名
				if (fieldTypeName.equals("int")) {
					int temp = rs.getInt(filedName);
					fields[i].set(ins, temp);
				}else if (fieldTypeName.equals("long")){
					long temp  = rs.getLong(filedName);
					fields[i].set(ins, temp);
				}else if (fieldTypeName.equals("String")){
					String temp  = rs.getString(filedName);
					fields[i].set(ins, temp);
				}else if (fieldTypeName.equals("double")){
					double temp  = rs.getDouble(filedName);
					fields[i].set(ins, temp);
				}else if (fieldTypeName.equals("Date")){
					Date temp  = rs.getDate(filedName);
					fields[i].set(ins, temp);
				}else {
					throw new RuntimeException("没有匹配的类型");
				}
			}
			list.add(ins);
		}
		return list;
	}
}
