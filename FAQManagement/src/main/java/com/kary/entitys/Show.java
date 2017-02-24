package com.kary.entitys;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Show {

	private Integer id;
	
	private String title;
	
	private String cname;//类别名
	
    private Date createdate;
	
	

	public Show(Integer id, String title, String cname, Date createdate) {
		super();
		this.id = id;
		this.title = title;
		this.cname = cname;
		this.createdate = createdate;
	}

	public Show() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCreatedate() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    	String format = sf.format(createdate);
    	return format;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
    	String format = sf.format(createdate);
		return "Show [id=" + id + ", title=" + title + ", cname=" + cname
				+ ", createdate=" + format + "]";
	}
	
}
