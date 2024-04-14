package com.learn.String;

import java.util.Scanner;

public class ReverseStringPreservingSpaces {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String str = scan.nextLine();
		
		char inputStrArray[] = str.toCharArray();
		
		char rStrArray[] = new char[inputStrArray.length];
		
		for(int i=0; i<inputStrArray.length; i++) {
			if(inputStrArray[i] == ' ') {
				rStrArray[i] = ' ';
			}
		}
		
		int j = inputStrArray.length-1; 
		
		for(int i=0; i<=rStrArray.length-1; i++) {
			if(inputStrArray[i]!= ' ') {
				while(rStrArray[j]==' ') {
					j--;
				}
				
				rStrArray[i] = inputStrArray[j];
				j--;
			}
			
		}
		
		System.out.println(rStrArray);
		
		
		

	}

}
