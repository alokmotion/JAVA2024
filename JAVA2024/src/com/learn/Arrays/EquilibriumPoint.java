package com.learn.Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		int[] arr = {1,0,2,4,7,3,6};
		int n = arr.length;
		
		int res = equilibriumPointApp(arr,n);
		System.out.println(res);
		
		

	}
	
	public static int equilibriumPointApp(int arr[] , int n) {
		
		if(n==1) return 1;
		
		int sum = 0;
		int leftsum =0;
		
		
		for(int i=0; i<n; i++) {
			sum += arr[i];
		}
		
		for(int i=0; i<n ; i++) {
			sum -= arr[i];
			if(leftsum == sum) {
				return i+1;
				
			} else {
				leftsum += arr[i];
			}
		}
		
		return -1;
		
		
		
		
	}

}
