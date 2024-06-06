package com.learn.OopsInJava;

public class PassingClassesToFunction {
	
	
	public static void fun(Student s) {
		System.out.println(s.name);
		return;	
	}
	
	public static void change(Student s) {
		s.name = "Anushka";
		
	}
	
	
	
	public static class Student {
		String name;
		int roll;
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Anshika";
		s1.roll = 10;
		
		System.out.println(s1.name);
		
		System.out.println("fun calling");
		
		fun(s1);
		
		
		
		change(s1);
		System.out.println("Change calling");
		
		System.out.println(s1.name);
		
		
//		we have to declare the class outside of main method 
//		classes passed by reference 
//		classes are user define data type

		
		
		
		

	}

}
