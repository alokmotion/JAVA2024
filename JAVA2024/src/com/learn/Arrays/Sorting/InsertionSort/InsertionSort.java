package com.learn.Arrays.Sorting.InsertionSort;

public class InsertionSort {
	public static int[] insertionSort(int []arr) {
		for(int i=1; i<arr.length; i++) {
			int item = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		return arr;
	}

}
