package com.learn.Arrays.Sorting.SelectionSort;

import java.util.Scanner;

public class SelectionSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Ask the size of array from the user
		System.out.println("Enter the size of an array");
		int arr[] = new int[scan.nextInt()];
		
		// take the element of an array from the user
		System.out.println("Enter the "+arr.length + " element " );
		for(int i =0; i<arr.length; i++) {
			arr[i]= scan.nextInt();
			
		}
		
		//displaying the array element before sorting
		for(int x :arr) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		int []sortedArray = SelectionSort.selectionSort(arr);
		
		for(int x :sortedArray) {
			System.out.print(x+" ");
		}
		
		
	}

}
