package com.learn.Arrays;

import java.util.Scanner;

public class IfDivisibleReplaceElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// take the size of array from user
		System.out.println("Enter size of Arrays");
		int arr[] = new int[scan.nextInt()];
		
		// collect array element from user
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.println("Enter the element of index = " + i);
			arr[i] = scan.nextInt();
			
		}
		
//		print the elements before condition check
		
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+ " ");
				
		}
		System.out.println();
		
		for(int i = 0; i<=arr.length-1; i++) {
			if(arr[i]%3 == 0) {
				arr[i] = -1;
			}
			
			
		}
//		print the elements after condition check
		
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+ " ");
				
		}
		
		// Close the scanner to avoid resource leak
        scan.close();

	}

}
