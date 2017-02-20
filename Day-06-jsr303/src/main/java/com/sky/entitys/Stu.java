package com.sky.entitys;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Stu {

	@NotNull(message="not empty不能为空 ")
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
