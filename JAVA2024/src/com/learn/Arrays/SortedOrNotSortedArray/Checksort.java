package com.learn.Arrays.SortedOrNotSortedArray;

public class Checksort {
	public static boolean checksort(int []arr) {
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>=arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}

}
