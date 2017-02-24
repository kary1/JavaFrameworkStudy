package com.kary.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kary.dao.ClassesMapper;
import com.kary.dao.FaqsMapper;
import com.kary.entitys.Classes;
import com.kary.entitys.Faqs;
import com.kary.entitys.Show;

@Service("fs")
public class FaqsService {

	@Autowired
	private FaqsMapper fm;

	public FaqsMapper getFm() {
		return fm;
	}

	public void setFm(FaqsMapper fm) {
		this.fm = fm;
	}

	@Autowired
	private ClassesMapper cm;

	public ClassesMapper getCm() {
		return cm;
	}

	public void setCm(ClassesMapper cm) {
		this.cm = cm;
	}

	public List<Faqs> findAll() {
		return fm.findAll();
	}

	public int save(Classes c, Faqs d) {
		int row = 0;
		try {
			Classes qc = cm.selectByCname(c.getCname());
			if (qc == null) 
				row += cm.insert(c);
			Classes temp = cm.selectByCname(c.getCname());
			d.setClassid(temp.getId());
			row += fm.insert(d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return row;
	}

	public List<Show> search(String key) {
		
		List<Show> slist = new ArrayList<>();
		List<Faqs> list = fm.search(key);
		for (Faqs faq : list) {
			String cname = cm.selectByPrimaryKey(faq.getClassid()).getCname();
			Show show = new Show(faq.getId(), faq.getTitle(), cname, faq.getCreatedate());
			slist.add(show);
		}
		return slist;
	}
}
