package com.learn.String;

import java.util.Scanner;

public class CharacterToUnicode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = scan.next().charAt(0);
		int uni = ch;
		System.out.println("Unicode value of charater "+ch+ " is "+uni);
		
		

	}

}
