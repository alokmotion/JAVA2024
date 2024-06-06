package com.learn.Arrays;

public class print2largestApp {

	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};
		int n = arr.length;
		
		print2largest(arr,n);
		
		

	}
	
	
	public static void  print2largest(int arr[], int n) {
		int largest = 0;
		for(int i=0; i<n-1; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		
		int secondLargest = -1 ;
		for(int i=0; i<n-1; i++) {
			if(arr[i] > secondLargest && arr[i] != largest ) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println(secondLargest);
		System.out.println(largest);
			
		
		
	}

}





// time complexcity nlogn hoga



//
//int temp;
//
//for(int i=0; i<arr.length-1; i++) {
//	
//	for(int j =0; j<arr.length-i-1; j++) {
//		
//		if(arr[j]>arr[j+1]) {
//			
//			temp = arr[j];
//			arr[j]=arr[j+1];
//			arr[j+1] = temp;
//		}
//	}
//}
//
//for(int i=0; i<arr.length; i++) {
//	System.out.println(arr[i]);
//}
//
//












