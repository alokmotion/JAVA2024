package com.learn.Arrays;

public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5};
		
		boolean result = true;
		
		for(int i = 0; i<=arr.length-2 ; i++) {
			for(int j=i+1; j<=arr.length-1 ; j++){
				if(arr[i] > arr[j]) {
					result = false;
					break;
					
					
				} 
				
			}
			
			
		}
		if(result) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
