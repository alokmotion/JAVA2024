package com.learn.Inheritance.Robot;

public class RobotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChefRobot cr = new ChefRobot();
		cr.cook();
		cr.talk();
		cr.walk();
		cr.charge();
		
		System.out.println("================");
		
		DoctorRobot dr = new DoctorRobot();
		dr.surgery();
		dr.talk();
		dr.walk();
		dr.charge();
		
		System.out.println("================");
		
		TeacherRobot t = new TeacherRobot();
		t.tech();
		t.talk();
		t.walk();
		t.charge();
		
		
		

	}
	
	
	

}

