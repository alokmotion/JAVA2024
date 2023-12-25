package com.learn.ControlConstructs;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,2};
		
		int result =1;
		
		for(int x: arr) {
			result *= x;
		}
		
		System.out.println(result);
		

	}

}
