package com.learn.classprograms;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter quantity of fruits");
		int quantity = scan.nextInt();
		
		String[] strArr = new String[quantity];
		
		for(int i=0; i<=strArr.length-1;i++) {
			System.out.println("Enter fruit name " + (i+1));
			strArr[i] = scan.next();
			
			
		}
		scan.close();
		
		for(int i = 0 ; i<=strArr.length-1; i++) {
			System.out.println("Fruit " + (i+1) + " is : " + strArr[i] );
		}
		
		

	}

}
