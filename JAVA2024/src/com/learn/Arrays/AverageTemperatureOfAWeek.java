package com.learn.Arrays;

import java.util.Scanner;

public class AverageTemperatureOfAWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tempOfEveryDay[]= {10,20,40,50,60,70,60};
		float AvgTemp = 0;
		for(int x : tempOfEveryDay) {
			AvgTemp += x;
		}
		System.out.println(AvgTemp/7);

	}

}
