package com.learn.arrayPractice;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		
//		You are tasked with creating a Java program that creates 
//		an array to store the heights of players in the teams of 
//		multiple countries. The program should assume that all countries
//		have the same number of teams, and each team has the same number 
//		of players. It should take user input for the number of countries,
//		the number of teams per country, the number of players per team, and
//		the heights of each player. It should then display all the heights.
//		Write a Java program that accomplishes this task.
		
		
		Scanner scan = new Scanner(System.in);
		double[][][] arr = new double[scan.nextInt()][scan.nextInt()][scan.nextInt()];
		
		for(int i = 0; i<= arr.length-1; i++) {
			for(int j = 0 ; j<= arr[i].length-1; j++) {
				for(int k = 0 ; k<= arr[i][j].length-1; k++) {
					arr[i][j][k] = scan.nextDouble();
				}
			}
		}
		
		
		for(int i = 0; i<= arr.length-1; i++) {
			for(int j = 0 ; j<= arr[i].length-1; j++) {
				for(int k = 0 ; k<= arr[i][j].length-1; k++) {
					System.out.print(arr[i][j][k]+" 	");
				}
				System.out.println();
			}
			
		}
		
		

	}

}
