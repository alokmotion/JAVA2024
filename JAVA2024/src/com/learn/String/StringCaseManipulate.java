package com.learn.String;

import java.util.Scanner;

public class StringCaseManipulate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		for(int i=0; i<=str.length()-1; i++) {
			char ch = str.charAt(i);
//			System.out.print(ch+ " ");
			
			if(Character.isUpperCase(ch)) {
				char newStr = Character.toLowerCase(ch);
				System.out.print(newStr);
			} else {
				char newStr = Character.toUpperCase(ch);
				System.out.print(newStr);
			}
			
		}
		
		

	}

}
