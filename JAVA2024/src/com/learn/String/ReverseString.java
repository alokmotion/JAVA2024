package com.learn.String;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("eNTER A STRING");
		String str = scan.nextLine();
		
		char [] strArr = str.toCharArray();
		char []arr = new char[strArr.length];
		
		int j = strArr.length-1;
		
		for(int i=0; i<strArr.length; i++) {
			arr[i] = strArr[j];
			j--;
			
		}
		String rStr = new String(arr);
		System.out.println(rStr);
		
		
		
	}

}
