package com.learn.Arrays.Sorting.SelectionSort;

public class SelectionSort {

	public static int[]selectionSort(int arr[]) {
		
		
		for(int i =0; i<arr.length-1; i++) {
			int pos = i;
			int min = arr[pos];
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<min) {
					min = arr[j];
					pos = j;
					
				}
			}
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
		
		
		
		
		return arr;
		
		

	}

}
