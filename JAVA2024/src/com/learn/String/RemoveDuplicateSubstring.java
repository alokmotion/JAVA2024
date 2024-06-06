package com.learn.String;

import java.util.Scanner;

public class RemoveDuplicateSubstring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input");
		String str = scan.nextLine();
		String[] newStr = str.split(" ");
		String ustr = "";
		
		for(int i=0;i<newStr.length; i++) {
			if(!(ustr.contains(newStr[i]))) {
				ustr += newStr[i]+" ";
			}
		}
		
		System.out.println(ustr);
		
		

	}

}
