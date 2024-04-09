package com.learn.String;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string to be reverse");
		String str = scan.nextLine();
		
		
		String[] strArr = str.split(" ");
		String[] strArr2 = new String[strArr.length];
		
		int j = strArr.length-1;
		for(int i=0; i<strArr.length; i++) {
			strArr2[i] = strArr[j];
			j--;
		}
		
		String rStr = String.join(" ", strArr2);
		System.out.println(rStr);

	}

}
