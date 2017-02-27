package com.oracle.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.oracle.entitys.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    int batchAddStudent(List<Student> stus);

    Integer deleteStudents(Integer[] sids);
	
    
}