package com.learn.String;

import java.util.Scanner;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence");
		String input = scan.nextLine();
		System.out.println(input);
		
		String result = capitalizeWords(input);
		System.out.println(result);
			

	}

	public static String capitalizeWords(String input) {
		String []arr =  input.split(" ");
		
		String newStr = "";
		for(int i =0; i<arr.length; i++) {			
			if(arr[i].charAt(0)>='a'&& arr[i].charAt(0)<='z') {
				char temp = arr[i].charAt(0);
				char newTemp = (char)(temp -32);
				arr[i] = newTemp+arr[i].substring(1);

			}		
			
		}
		
		StringBuffer st = new StringBuffer();
		
		for(int i =0; i<arr.length; i++) {
			newStr = newStr+arr[i]+" ";
		}
		
		return newStr;
			
	}
	

}
