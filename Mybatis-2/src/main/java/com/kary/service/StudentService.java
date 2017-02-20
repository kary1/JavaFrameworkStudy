package com.kary.service;

import com.kary.dao.StudentMapper;
import com.kary.entitys.Student;
//2.1 @Service
public class StudentService {

	//2.1 @Autowired
	/**
	 *  注入dao接口的实现类对象
	 *  使用设置注入方法
	 *  通过set方法把对象注入到属性上
	 */
	private StudentMapper sm;
	public void setSm(StudentMapper sm) {
		this.sm = sm;
	}
	public int saveStu(Student stu){
		int ret = 0;
		try {
			ret = sm.insert(stu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
	
}
