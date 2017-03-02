package com.kary.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kary.entitys.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

//    传递多个参数的方法：
//     1.map
//     2.对象
//     3.命名参数
	List<Student> findStudentByPage(@Param("start")Integer start, @Param("pageSize")Integer pageSize);
	
	int queryTotalRows();
}