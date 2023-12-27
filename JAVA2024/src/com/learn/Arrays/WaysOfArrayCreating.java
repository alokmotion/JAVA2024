package com.learn.Arrays;

public class WaysOfArrayCreating {

	public static void main(String[] args) {
		
//		different Ways of creating Array
		
//		1D Array 
//		1st Ways 
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
//		2nd Ways
		
		int arr1[] = {1,2,3,4,5};
		
//		3rd Way 
		
		int arr2[] = new int[] {5,6,7,8,9,0};
		
		
		
		
//		2D Arrays
		
//		1st WAys
		int[][] d2arr = new int[1][2];
		d2arr[0][0] = 10;
		d2arr[0][1] = 20;
		
		
//		2nd Ways
		
		int arr4[][]= {{10,20,30},{40,50,60}};
		
		int arr5[][] = {
				{10,20},
				{30,40,50,60},
				{80,90,100}
		};
		
		
//		3rd Ways
		
		int arr6[][]= new int [][] {{10,20,30},{40,50,60}};
		
		
//		3d Arrays
		
		
//		1st Ways
		
		
		int arr7[][][] = new int[5][2][3];
		
		for(int x: arr) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
