package com.learn.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class YoungestStudentOfClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of student of a class");
		int std[] = new int[scan.nextInt()];
		
		for(int i = 0; i<std.length ; i++) {
			System.out.println("Enter the age of Student " + i+1);
			std[i] = scan.nextInt();
			
		}
		Arrays.sort(std);
		for(int x : std) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(std[0]);
		
		

	}

}
