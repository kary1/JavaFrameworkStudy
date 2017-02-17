package com.sky.entity;

public class Stu {

	private int stuId;
	private int stuAge;
	private String stuName;
	public Stu() {
		super();
	}
	public Stu(int stuId, int stuAge, String stuName) {
		super();
		this.stuId = stuId;
		this.stuAge = stuAge;
		this.stuName = stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	@Override
	public String toString() {
		return "Stu [stuId=" + stuId + ", stuAge=" + stuAge + ", stuName="
				+ stuName + "]";
	}
	
}
