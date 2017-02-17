package com.sky.entity;

public class Stu {

	private String name;
	private Integer age;
	private String like;
	
	
	public Stu() {
		super();
	}
	public Stu(String name, Integer age, String like) {
		super();
		this.name = name;
		this.age = age;
		this.like = like;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}
	@Override
	public String toString() {
		return "Stu [name=" + name + ", age=" + age + ", like=" + like + "]";
	}
	
	
}
