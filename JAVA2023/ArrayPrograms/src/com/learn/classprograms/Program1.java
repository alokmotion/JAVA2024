package com.learn.classprograms;

public class Program1 {

	public static void main(String[] args) {
	
//	creating an array	
		int [] arr = new int[5];
		
//		store the ages in array 
		
		arr[0] = 21;
		arr[1] =22;
		arr[2] =23;
		arr[3] =24;
		arr[4] =25;
		
		System.out.println("array of length is: " + arr.length);
		
		
//		displaying the ages present in array
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
		
//		use loop to print array
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
