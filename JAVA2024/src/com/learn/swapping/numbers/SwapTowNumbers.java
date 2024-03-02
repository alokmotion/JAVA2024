package com.learn.swapping.numbers;

import java.util.Scanner;

public class SwapTowNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of X and Y ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println("You have entered value of x and y " + x + " " +y);
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("After swapping value of x and y " + x + " " +y);
				
	}

}
