package com.learn.classprograms;

import java.util.Scanner;

public class Program4 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
//		Asking the no fo companies and employees from user
//		
//		System.out.println("Enter the Size of Company");
//		int sizeOfCoy = scan.nextInt();
//		System.out.println("Enter the Size of Employee in each company");
//		int sizeOfEmp= scan.nextInt();
//		
//		
//		String[][] arr = new String [sizeOfCoy][sizeOfEmp];
		
		
//		OR
		
//		Asking the no fo companies and employees from user
		
		System.out.println("Enter the no of companies and each company employee");
		
		
		
		String[][] arr = new String [scan.nextInt()][scan.nextInt()];
		
		
		for(int i = 0; i<= arr.length-1 ; i++) {
			
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.println("Enter the Emplyee name of company " + (i+1) + "employee " + (j+1)  );
				arr[i][j] = scan.next();
								
			}
		}
		
		
		
		for(int i = 0; i<= arr.length-1 ; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.println("the name of company " + (i+1) + "employee" + (j+1) +  "is : " +arr[i][j]);
				
				
			}
		}
	
	}

}
