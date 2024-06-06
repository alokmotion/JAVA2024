package com.learn.Recursion;

import java.util.Scanner;

public class TableOfUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		table(input);

	}
	public static void table(int input) {
		
		if(input==0) {
			return;
		} for(int i=1; i<=10;i++) {
			System.out.println(input +" *" + i+ i*input);
			
		}
	}

}
