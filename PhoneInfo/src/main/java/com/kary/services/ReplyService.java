package com.kary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kary.dao.InformationsMapper;
import com.kary.dao.RepliesMapper;
import com.kary.entitys.Informations;
import com.kary.entitys.Replies;

@Service
public class ReplyService {

	@Autowired
	private RepliesMapper rmd;
	public RepliesMapper getRmd() {
		return rmd;
	}
	public void setRmd(RepliesMapper rmd) {
		this.rmd = rmd;
	}
	@Autowired
	private InformationsMapper imd;
	public InformationsMapper getImd() {
		return imd;
	}
	public void setImd(InformationsMapper imd) {
		this.imd = imd;
	}
	public List<Replies> getByInfoId(Integer id) {
		List<Replies> infoList = null;
		try {
			infoList = rmd.selectByInfoid(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return infoList;
	}
	public Replies save(Replies replies) {
		int row = 0;
		Replies temp = rmd.selectByInfoidAndContent(replies);;
		if (temp != null) {
			return null;
		}
		row += rmd.insert(replies);			
		try {
			if (row == 1) {
				temp = rmd.selectByInfoidAndContent(replies);
				Informations info = new Informations();
				info.setLastposttime(temp.getReplytime());
				info.setId(temp.getInflod());
				row += imd.updateByPrimaryKeySelective(info);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (row == 2) {
			return temp;
		}
		return null;
	}
	
}
