package com.sky.service;

import java.util.List;

import com.sky.dao.StuDaoImpl;
import com.sky.entity.Stu;

public class StuServiceImpl {

	private StuDaoImpl sdi = new StuDaoImpl();
	
	public List<Stu> findAll(){
		List<Stu> list = null;
		try {
			list = sdi.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public int add(Stu stu) {
		int row = 0;
		try {
			row = sdi.save(stu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
}
