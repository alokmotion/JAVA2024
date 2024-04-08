package com.learn.String;

public class MutalbleString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("I am learning jav");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.append(" I am learning java");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		
		// string builder
		System.out.println("String Builder");
		
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());
		
		sb.append("I am learning jav");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		sb.append(" I am learning java");
		System.out.println(sb2);
		System.out.println(sb2	.capacity());

	}

}
