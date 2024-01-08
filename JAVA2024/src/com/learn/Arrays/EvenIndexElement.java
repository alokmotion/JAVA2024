package com.learn.Arrays;

import java.util.Scanner;

public class EvenIndexElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int[] arr = new int[scan.nextInt()];
		
		for(int i = 0; i<=arr.length-1; i++) {
			System.out.println("Enter the Element of index " + (i+1)) ;
			arr[i] = scan.nextInt();
			
		}
		
		for(int i = 0; i<=arr.length-1; i++) {
			if(i%2==0) {
				System.out.print(arr[i] + " ");
			}
			
		}
		
		
	}

}
