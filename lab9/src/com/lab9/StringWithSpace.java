package com.lab9;

import java.util.Scanner;

public class StringWithSpace {
	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		StringExp str= (str1) -> {
			char[] ch= str1.toCharArray();
			String str2= "";
			for(int i= 0; i<ch.length;i++) {
				str2+= ch[i]+ " ";
			}
			return str2;
		};
		
		System.out.println("Enter a String: ");
		String str3= scn.next();
		System.out.println();
		System.out.println("Result: "+ str.stringExpressString(str3));
		
		scn.close();


	}

}
