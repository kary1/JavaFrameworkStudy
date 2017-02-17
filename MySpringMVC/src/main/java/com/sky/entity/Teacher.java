package com.sky.entity;

public class Teacher {

	private String name;
	private Integer age;
	private Adress adress;
	public Teacher() {
		super();
	}
	public Teacher(String name, Integer age, Adress adress) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
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
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", adress=" + adress
				+ "]";
	}
	
	
}
