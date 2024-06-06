package com.learn.Arrays;



public class StudentApp{
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"Ram",12);
		Student s2 = new Student(2,"Raju",13);
	}
	

	
}

class Student {
	int rollNumber;
	String name;
	int age;

	
	// contructor 
	
	public Student(int rollNumber, String name, int age) {
		this.rollNumber = rollNumber;
		this.name =name;
		this.age = age;
	}
	
	
	

}





