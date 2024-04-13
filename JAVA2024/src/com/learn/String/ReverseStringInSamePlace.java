package com.learn.String;

import java.util.Scanner;

public class ReverseStringInSamePlace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentance to be reversed");
		String str = scan.nextLine();
		String[] strArr = str.split(" ");
		
		for(int i=0; i<strArr.length; i++) {
			char arr[] = strArr[i].toCharArray();
			// creating new string varibale
			String revStr = "";
			
			for(int j = arr.length-1; j>=0; j--) {
				revStr = revStr + arr[j];
				System.out.println(revStr);
			}
			
			strArr[i]= revStr+" ";
			System.out.println(strArr[i]);
			
		}
		
		String rStr = "";
		
		for(int i=0; i<strArr.length;i++) {
			rStr = rStr+ strArr[i];
		}
		System.out.println(rStr);
		
		
		
		
		

	}

}



/**  logic 2
      for(int i=0;i<strArr.length;i++) {
			
			char [] strArr2 = strArr[i].toCharArray();
			char []arr = new char[strArr2.length];
			
			int j = strArr2.length-1;
			
			for(int k=0; k<strArr2.length; k++) {
				arr[k] = strArr2[j];
				j--;
				
			}
			
			String rStr = new String(arr);
            System.out.print(rStr + " ");
			
		}
 
  **/
 