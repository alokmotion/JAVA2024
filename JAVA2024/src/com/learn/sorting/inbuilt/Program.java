package com.learn.sorting.inbuilt;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int arr[] = {12,33,44,55,4,3,45,91,23};
		
		System.out.println("Elenets Before swapping");
		for(int x: arr) {
			System.out.print(x+ " ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("Elements after swapping");
		for(int x: arr) {
			System.out.print(x+ " ");
		}
	}

}
