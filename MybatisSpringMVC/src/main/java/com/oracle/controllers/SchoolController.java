package com.oracle.controllers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oracle.bizs.SchoolBiz;
import com.oracle.entitys.Student;

@Controller
public class SchoolController {
	@Autowired
	private SchoolBiz sbiz;
    /**
     *  新增学生
     * @return
     */
	@RequestMapping(value="addStudent")
	public String addStudent(Student stu,ModelMap map){
		int ret=sbiz.addStudent(stu);
		String message="新增失败";
		//新增失败时跳转路径
		String path="addStudent.jsp";
		if(ret>0){
			message="新增成功";
			//新增成功时的跳转路径
			path="showStudent.jsp";
		}
		map.put("message", message);
		return path;
		
	}
	/**
	 * 批次新增
	 */
	@RequestMapping(value="batchAddStudent")
	public String batchAddStudents(StudentList stuList,ModelMap map){
		String path="showStudent.jsp";
		List<Student> stus=stuList.getStus();
		int ret=sbiz.batchAddStudent(stus);
		String message="新增失败";
		if(ret>0){
			message="新增成功";
			//新增成功时的跳转路径
			path="showStudent.jsp";
		}
		map.put("message", message);
		return path;
	}
	@RequestMapping(value="deleteStudent")
	public String deleteStudents(@RequestParam(value="sids[]")Integer[] sids,ModelMap map){
		String path="showStudent.jsp";
		
		int ret=sbiz.deleteStudents(sids);
		String message="删除失败";
		if(ret>0){
			message="删除成功";
			//新增成功时的跳转路径
			path="showStudent.jsp";
		}
		map.put("message", message);
		return path;
	}
}
