package com.learn.swapping.numbers;

import java.util.Scanner;

public class SwappingArrayElements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array :");
		int arr[] = new int[scan.nextInt()];
		
		// asking the enter element in arrays
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			
		}
		
		// asking the index value which have to perform swapping 
		System.out.println("Enter the tow index value which have to perform swapping action");
		int i1 = scan.nextInt();
		int i2 = scan.nextInt();
		
		// print the element before swapping
				for(int x : arr) {
					System.out.print(x + " ");
				}
				System.out.println();
		
		int temp;
		if(i1>=0 && i1<= arr.length-1 && i2>=0 && i2<= arr.length-1) {
			temp = arr[i1];
			arr[i1] = arr[i2];
			arr[i2] = temp;
		} else {
			System.out.println("Pease enter index value between o and" + (arr.length-1));
		}
		
		for(int x : arr) {
			System.out.print(x+ " ");
		}

	}

}
