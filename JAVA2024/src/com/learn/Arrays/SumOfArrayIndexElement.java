package com.learn.Arrays;

import java.util.Scanner;

public class SumOfArrayIndexElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		int arr3[] = new int[n];
		
		System.out.println("Enter the first array Element");
		for(int i= 0; i<n; i++) {
			arr1[i] = scan.nextInt();
			
		}
		
		
		System.out.println("Enter the Second array Element");
		for(int i= 0; i<n; i++) {
			arr2[i] = scan.nextInt();
			
		}
		
		for(int i= 0; i<n; i++) {
			arr3[i] = arr1[i]+arr2[i];
			
			
		}
		
		System.out.println("1st Array");
		
		for( int x : arr1) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("2nd Array");
		
		for( int x : arr2) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("New Array , Addition");
		
		for( int x : arr3) {
			System.out.print(x + " ");
		}
		
		
		
		

	}

}
