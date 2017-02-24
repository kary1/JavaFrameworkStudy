package com.kary.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kary.dao.InformationsMapper;
import com.kary.entitys.Informations;

@Service
public class InfoService {

	@Autowired
	private InformationsMapper imd;
	public InformationsMapper getImd() {
		return imd;
	}
	public void setImd(InformationsMapper imd) {
		this.imd = imd;
	}
	
	public int addInfo(Informations info){
		int row = 0;
		try {
			imd.insert(info);
			row = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}
	public List<Informations> showAll() {
		List<Informations> list = new ArrayList<>();
		try {
			list = imd.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
		return list;
	}
	
	public Informations getById(int id){
		Informations info = null;
		try {
			imd.updateViewCount(id);
			info = imd.selectByPrimaryKey(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return info;
	}
}
