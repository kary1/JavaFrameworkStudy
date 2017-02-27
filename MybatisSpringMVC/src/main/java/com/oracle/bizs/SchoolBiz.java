package com.oracle.bizs;

import java.util.List;

import com.oracle.entitys.Student;
import com.oracle.mappers.StudentMapper;
import com.oracle.mappers.TeacherMapper;

public class SchoolBiz {
	private StudentMapper sm;
	private TeacherMapper tm;

	public StudentMapper getSm() {
		return sm;
	}

	public void setSm(StudentMapper sm) {
		this.sm = sm;
	}

	public TeacherMapper getTm() {
		return tm;
	}

	public void setTm(TeacherMapper tm) {
		this.tm = tm;
	}
	/**
	 * 新增学生
	 */
	public int addStudent(Student stu){
		int ret=0;
		//调用数据访问层的方法
		System.out.println("before insert"+stu.getSid());
		ret=sm.insert(stu);
		System.out.println("after insert"+stu.getSid());
		return ret;
	} 
	
	/**
	 * 批次新增学生
	 */
	
	public int batchAddStudent(List<Student> stus){
		int ret=0;
		ret=sm.batchAddStudent(stus);
		System.out.println("受影响的行数是"+ret);
		return ret;
	}

	public int deleteStudents(Integer[] sids) {
		sm.deleteStudents(sids);
		return 0;
	}
}
