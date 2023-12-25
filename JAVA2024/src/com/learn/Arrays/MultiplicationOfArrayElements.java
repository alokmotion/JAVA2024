package com.learn.Arrays;

public class MultiplicationOfArrayElements {
	public static void main(String[] args) {
		int[] arr = {2,4,3};
		
		int result =1;
		
		for(int i = 0; i<=arr.length-1; i++) {
			result *= arr[i];
		}
		
		System.out.println(result);
	}

}
