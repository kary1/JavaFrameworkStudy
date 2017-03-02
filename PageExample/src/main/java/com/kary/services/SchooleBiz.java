package com.kary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kary.dao.StudentMapper;
import com.kary.dao.TeacherMapper;
import com.kary.entitys.Student;

@Service
public class SchooleBiz {

	@Autowired
	private StudentMapper sm;
	@Autowired
	private TeacherMapper tm;
	
	
	
	public List<Student> findStudentByPage(Integer currentPage , Integer row){
		List<Student> stus = null;
		Integer pageSize = row;
		stus = sm.findStudentByPage((currentPage - 1) * row, pageSize);
		return stus;
	}
	public int findStudentTotalpage(int a){
		int rows = sm.queryTotalRows();
		int totalPage = (rows % a) == 0 ? rows / a : rows / a + 1;
		return totalPage;
	}
}
