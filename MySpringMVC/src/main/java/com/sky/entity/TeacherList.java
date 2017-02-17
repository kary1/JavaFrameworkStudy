package com.sky.entity;

import java.util.List;

public class TeacherList {

	
	
	private List<Teacher> tlist;

	

	public TeacherList() {
		super();
	}

	@Override
	public String toString() {
		return "TeacherList [list=" + tlist + "]";
	}

	public List<Teacher> getTlist() {
		return tlist;
	}

	public void setTlist(List<Teacher> tlist) {
		this.tlist = tlist;
	}
	
}
