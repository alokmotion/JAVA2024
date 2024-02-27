package com.learn.Arrays;

import java.util.Scanner;

public class ShortAndMergeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of first Array");
		int arr1[] = new int[scan.nextInt()];
		System.out.println("Enter the size of second Array");
		int arr2[] = new int[scan.nextInt()];
		
		for(int i = 0; i<=arr1.length-1; i++) {
			System.out.println(" arr1, Enter the element of index = " + i);
			arr1[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i<=arr2.length-1; i++) {
			System.out.println(" arr2, Enter the element of index = " + i);
			arr2[i] = scan.nextInt();
			
		}
		
		int arr3[] = new int[(arr1.length + arr2.length)];
		
//		copying element from arr1 to arr3 
		for(int i=0; i<=arr1.length-1; i++) {
			arr3[i] = arr1[i];
			
		}
		
//		copying element from arr2 to arr3
		int j=0;
		
		for(int i=arr1.length; i<=arr3.length-1; i++) {
			arr3[i] = arr2[j];
			j++;
			
		}
		
		for (int x : arr1) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
		for (int x : arr2) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
		for (int x : arr3) {
			System.out.print(x+ " ");
		}
		
		
		
		
		

	}

}
