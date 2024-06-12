package com.learn.Encapsulation.LaptopApp;

public class LaptopApp {

	public static void main(String[] args) {
		Laptop L1 = new Laptop("intel",512);
		System.out.println(L1.getProcessorName());
		System.out.println(L1.getMemorySize());
		
		Laptop L2 = new Laptop("AMD",1024);
		
		System.out.println(L2.getProcessorName());
		System.out.println(L2.getMemorySize());

	}

}
