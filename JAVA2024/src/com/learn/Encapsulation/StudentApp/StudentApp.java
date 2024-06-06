package com.learn.Encapsulation.StudentApp;

public class StudentApp {

	public static void main(String[] args) {
		Student st = new Student();
		st.setData(2, "Anshika", 20);
		
		System.out.println("Roll Number " + st.getRollNo());
		System.out.println("Name " + st.getName());
		System.out.println("Age " + st.getAge());

	}

}
