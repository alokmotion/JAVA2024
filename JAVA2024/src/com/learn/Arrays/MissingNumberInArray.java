package com.learn.Arrays;

import java.util.Scanner;

public class MissingNumberInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int sizeArr = scan.nextInt();
		
		int[] arr = new int[sizeArr];
		
		
		for(int i=0; i<arr.length-1; i++) {
			arr[i]=scan.nextInt();
			
		}
		
		
		int res =missingNumber(sizeArr, arr);
		System.out.println(res);
		

	}
	
	public static int missingNumber(int n ,int arr[]){
		int sumOfNtNumber = (n*(n+1)/2);
		
//		fine the sum of array
		
		int sumOfArr =0;
		for(int i=0; i<arr.length; i++) {
			sumOfArr += arr[i];
		}
		
		int missingNum = sumOfNtNumber - sumOfArr;
		
		return missingNum;
	}

}
