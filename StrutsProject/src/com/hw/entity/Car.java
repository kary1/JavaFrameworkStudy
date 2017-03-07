package com.hw.entity;

public class Car {

	private int id;
	private String name;
	private String color;
	private String type;
	
	public Car() {
	}
	public Car( String name, String color, String type) {
		this.name = name;
		this.color = color;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
