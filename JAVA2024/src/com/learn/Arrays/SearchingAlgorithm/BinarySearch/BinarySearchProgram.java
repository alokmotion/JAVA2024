package com.learn.Arrays.SearchingAlgorithm.BinarySearch;

import java.util.Scanner;

public class BinarySearchProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
//		creating the array
		int [] arr = new int [scan.nextInt()];
		System.out.println("Enter " + arr.length + "Elements");
//		storing the element in the arrays
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
//		asking for the to be searched 
		System.out.println("Enter the key to be searched in the arrays");
		int key = scan.nextInt();
//		low = 0th index , high = last index 
		int low = 0, high = arr.length-1;
//		searching for the key until low <= high
		while(low<=high) {
//			calculating mid for every iteration
			int mid = (low+high)/2;
//			checking of the key is present at index mid 
			if(key == arr[mid]) {
				System.out.println("key found at index : " + mid);
				return;
			}	
//				if key not present , checking whether key is greater 	than	arr[mid]
			 
			
			else if(key > arr[mid]) {
				low = mid +1;
				
			} 
//			if key is not present and key is not greater than arr[mid], 
//			means it 	is lesser than arr[mid]
			else {
				high = mid -1;
			}
		}
		
//		printing the message if key not found 
		System.out.println("Key not found");
	}

}
