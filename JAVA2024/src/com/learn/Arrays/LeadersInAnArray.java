package com.learn.Arrays;

import java.util.ArrayList;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= { 16,17,4,3,5,2};
		int n = arr.length;
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		int maxElement = arr[n-1];
		res.add(maxElement);
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i]>= maxElement){
				maxElement = arr[i] ;
				res.add(maxElement);
            }
		}
		
		for(int i=0; i<res.size(); i++) {
			System.out.println(res.get(i));
		}
		
		
		 
		
		

		

	}

}
