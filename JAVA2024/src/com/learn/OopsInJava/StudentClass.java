package com.learn.OopsInJava;

public class StudentClass {
	
//	creating a new data type named student-
//	public static class Student{
//		int rollNumber;
//		String name;
//		double percentage;
//		
//	}

	public static void main(String[] args) {
		Student s1 = new Student();  // object declaration 
		s1.name = "Alok";
		s1.rollNumber = 10;
		s1.percentage = 90;
		
		System.out.println("Student Name => "+ s1.name);
		System.out.println("Student Roll Number => "+s1.rollNumber);
		System.out.println("Student Percentage => " + s1.percentage + "%");
		
		System.out.println();
		System.out.println("==============================");
		System.out.println();
		
		Student s2 = new Student();
		s2.name = "Aniruddh";
		s2.rollNumber = 9;
		s2.percentage = 98;
		
		
		System.out.println("Student Name => "+ s2.name);
		System.out.println("Student Roll Number => "+s2.rollNumber);
		System.out.println("Student Percentage => " + s2.percentage + "%");
		
		

	}

}
