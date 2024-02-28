package com.learn.Arrays.SearchingAlgorithm.LinearSearch;

import java.util.Scanner;

public class KeyFound {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[] = new int[scan.nextInt()];
		
		
		for(int i=0; i<arr.length ; i++) {
			System.out.println("Enter the element of index " +i );
			arr[i]= scan.nextInt();
		}
		
		System.out.println("Enter the key that you find");
		int key = scan.nextInt();
		
		
				
		for(int i=0; i<arr.length ; i++) {
			if(key==arr[i]) {
				System.out.println("Key found at index : " + i);
				return;
			}
		}
		System.out.println("Key not found");
		
	}

}
