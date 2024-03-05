package com.learn.Arrays.SortedOrNotSortedArray;

import java.util.Scanner;

public class ChecksortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[] = new int[scan.nextInt()];
		
		
		//taking the element of array from user
		System.out.println("Enter the " + arr.length + "Elements");
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		
		boolean sorted = Checksort.checksort(arr); // Sort the array first;
		if(sorted) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array not sorted");
		}

	}

}
