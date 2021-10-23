package day2.assignments.strings;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveStrings {
	public static void main(String[] args) {

		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a string to check it is positive string or not: ");
		String str= scn.nextLine();

		//check whether the string is a positive string or not
		if(isAlphabaticOrder(str)) {
			System.out.println(str+" is a positive string");
		}
		else {
			System.out.println(str+" is not a positive string");
		}


	}

	// Method that checks whether the string is in alphabetical order or not
	public static boolean isAlphabaticOrder(String str) {

		// length of the string
		int length= str.length();

		//Create a char array of length as string
		char chars[]= new char[length];

		//assign the string to char array
		for(int i=0; i<length; i++) {
			chars[i]= str.charAt(i);
		}

		//sort the char array
		Arrays.sort(chars);

		//check if the char array is equal to string or not
		for(int i= 0; i<length; i++) {
			if(chars[i]!=str.charAt(i))
				return false;
		}
		return true;
	}

}


