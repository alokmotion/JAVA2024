package com.learn.Arrays.Sorting.BubbleSort;

public class BubbleSort {
	//method to sort an array using bubble sort algorithm
	
	public static int[] bubbleSort(int arr[]) {
		int temp;
		//traversing through entire array
		for(int i=0; i<arr.length-1; i++) {
			//traversing to all element in each itration
			for(int j =0; j<arr.length-i-1; j++) {
				//checking whether jth element is grater than j+1 or next element
				if(arr[j]>arr[j+1]) {
					//if arr[j] > arr[j+1] then perform swapping 
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// returning the sorted array
		return arr;
		
	}

}
