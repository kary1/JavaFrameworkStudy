package com.oracle.controllers;

import java.util.ArrayList;
import java.util.List;

import com.oracle.entitys.Student;

public class StudentList {
	private List<Student> stus=new ArrayList<Student>();

	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

}
