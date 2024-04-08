package com.learn.String;

import java.util.Scanner;

public class GetCharacterAtIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputString =  scan.nextLine();
		int index = scan.nextInt();
		char character = getCharacterAtIndexApp(inputString,index);
		
		System.out.println("character at index " + index + ": " + character);
		
		
	}
	
	
	public static char getCharacterAtIndexApp(String inputString , int index) {
		char ch = inputString.charAt(index);
		return ch;
	}

}
