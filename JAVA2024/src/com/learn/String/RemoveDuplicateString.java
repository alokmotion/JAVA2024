package com.learn.String;

import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.nextLine();
		char []arr = str.toCharArray();
		String newStr = "";
		
		
		for(int i=0; i<arr.length-1; i++) {
			if(!(newStr.contains(String.valueOf(arr[i])))) {
				newStr += arr[i];
			}
		
			
		}
		
		System.out.println(newStr);

	}

}
