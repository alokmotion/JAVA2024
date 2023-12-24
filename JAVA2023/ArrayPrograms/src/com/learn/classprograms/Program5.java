package com.learn.classprograms;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] main) {
		Scanner scan = new Scanner(System.in);
		
		float[][] arr = new float[3][];
		arr[0] = new float[4];
		arr[1] = new float[5];
		arr[2] = new float[3];
		
		System.out.println("enter percentage ");
		
		for(int i = 0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j] = scan.nextFloat();
			}
		}
		
		
		System.out.println("the array content is ");
		for(int i=0; i<= arr.length-1; i++) {
			for(int j=0; j<= arr[i].length-1; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
