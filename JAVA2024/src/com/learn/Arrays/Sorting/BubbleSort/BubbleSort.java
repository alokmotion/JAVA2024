package com.learn.Arrays.Sorting.BubbleSort;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {36,19,29,5};
		
		int temp;
		
		for(int i = 0 ; i<a.length; i++) {
			for(int j = 0; j<a.length-1-i; j++) {
				if(a[i]> a[j+1]) {
					temp = a[i];
					a[i] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
		
		for(int x : a) {
			System.out.println(x);
		}
		
	}

}
