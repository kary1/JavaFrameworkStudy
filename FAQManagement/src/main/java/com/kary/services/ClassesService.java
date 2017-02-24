package com.kary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kary.dao.ClassesMapper;
import com.kary.entitys.Classes;


@Service("cs")
public class ClassesService {
	@Autowired
	private ClassesMapper cm;
	public ClassesMapper getCm() {
		return cm;
	}
	public void setCm(ClassesMapper cm) {
		this.cm = cm;
	}
	
	
	public int save(Classes c) {
		int row = 0;
		row = cm.insert(c);
		return row;
	}
	public List<Classes> findAll() {
		return cm.findAll();
	}
	
	
}
