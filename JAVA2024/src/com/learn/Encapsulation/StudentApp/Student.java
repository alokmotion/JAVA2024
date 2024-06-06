package com.learn.Encapsulation.StudentApp;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	
	
	public void setData(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	

}
