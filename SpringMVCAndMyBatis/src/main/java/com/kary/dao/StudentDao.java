package com.kary.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

import com.kary.entitys.Student;
@Component("sdao")
public class StudentDao implements StudentMapper {

	@Override
	public int deleteByPrimaryKey(Integer stuid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Student selectByPrimaryKey(Integer stuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> findAll() {
		SqlSession session = BaseDao.getSqlSession();
		List<Student> stus = session.selectList("com.kary.dao.StudentMapper.findAll");
		return stus;
	}

}
