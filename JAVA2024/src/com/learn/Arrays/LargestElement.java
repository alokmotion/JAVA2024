package com.learn.Arrays;

import java.util.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {20,2,50,10,3,7,9};
		
//		1st Ways
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-1]);
		
		
		
//		optimal solution
		int max = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[0]<arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);

	}

}
