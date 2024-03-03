package com.learn.Arrays.Sorting.BubbleSort;

import java.util.Scanner;

public class BubbleSortApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Asking the size of an array
		System.out.println("Enter the size of Array");
		int [] arr = new int [scan.nextInt()];
		// taking the element in array from user
		System.out.println("Enter the " + arr.length + " of an Arrays");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();			
		}
		//displaying the array before sorted
		System.out.println("The array element are before swapping");
		for(int x :arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		//calling the method bubblesort
		int [] sortedArray = BubbleSort.bubbleSort(arr);
		// displaying the sorted array
		System.out.println("Array after soritng");
		for(int y:sortedArray) {
			System.out.print(y+" ");
		}
		
		
		
	}

}
