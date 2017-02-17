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
	
	public List<T> query(Class<T> t, PrepareStatementSetter setter,String sql) throws SQLException{
		List<T> list = new ArrayList<>();
		Connection conn = ConnectionFactory.getInstance().getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		if (setter != null) {
			setter.setter(ps);
		}
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Field[] fields = t.getDeclaredFields();
			T ins = null;
			try {
				ins = t.newInstance();
				for (int i = 0; i < fields.length; i++) {
					fields[i].setAccessible(true);
					String filedName = fields[i].getName();//获得属性名
					String fieldTypeName = fields[i].getType().getSimpleName();//获得属性的类型名
					if (fieldTypeName.equals("int")) 
						fields[i].set(ins, rs.getInt(filedName));
					else if (fieldTypeName.equals("long"))
						fields[i].set(ins, rs.getLong(filedName));
					else if (fieldTypeName.equals("String"))
						fields[i].set(ins, rs.getString(filedName));
					else if (fieldTypeName.equals("double"))
						fields[i].set(ins, rs.getDouble(filedName));
					else if (fieldTypeName.equals("Date"))
						fields[i].set(ins, rs.getDate(filedName));
				}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//获得实例
			list.add(ins);
		}
		return list;
	}
}
