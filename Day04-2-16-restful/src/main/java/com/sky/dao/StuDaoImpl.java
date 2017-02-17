package com.sky.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sky.entity.Stu;
import com.sky.jdbc.JDBCTemplate;
import com.sky.jdbc.PrepareStatementSetter;

public class StuDaoImpl extends JDBCTemplate<Stu>{

	public List<Stu> queryAll() throws Exception{
		String sql = "select * from student";
		List<Stu> list = query(Stu.class, null, sql);
		return list.size() == 0 ? null : list;
	}
	public int save(final Stu stu) throws Exception{
		int row = 0;
		System.out.println(stu);
		String sql = "insert into student(stuAge,stuName) values(?, ?)";
		row = update(new PrepareStatementSetter() {
			
			@Override
			public void setter(PreparedStatement ps) throws SQLException {
				ps.setInt(1, stu.getStuAge());
				ps.setString(2, stu.getStuName());
			}
		}, sql);
		return row;
	}
}
