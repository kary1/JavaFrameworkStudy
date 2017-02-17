package com.sky.entity;

public class Adress {

	private String num;
	private String street;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Adress(String num, String street) {
		super();
		this.num = num;
		this.street = street;
	}
	public Adress() {
		super();
	}
	@Override
	public String toString() {
		return "Adress [num=" + num + ", street=" + street + "]";
	}
}
