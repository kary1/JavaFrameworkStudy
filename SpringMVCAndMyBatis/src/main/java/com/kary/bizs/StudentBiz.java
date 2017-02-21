package com.kary.bizs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kary.dao.StudentMapper;
import com.kary.entitys.Student;

/**
 * @author kary
 * 
 * @Service 修饰类，这个类被当作业务逻辑组件
 * 可用@component替换
 * 
 * ("sbiz")当spring容器扫描到这个bean后创建bean的实例取名为sbiz
 *   相当于<bean id="sbiz" class="com.kary.bizs.StudentBiz">
 * 可以不写,
 *   不写时等同于<bean id="studentBiz" class="com.kary.bizs.StudentBiz">
 */
@Service("sbiz")
public class StudentBiz {
	@Autowired//自动装配
	private StudentMapper sdao;
	
	public List<Student> findStudent(){
		return sdao.findAll();
	}
}
