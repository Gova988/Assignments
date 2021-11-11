package com.lab9;

import java.util.Scanner;

public class Autenticate {
	public static void main(String[] args) {
Scanner scn= new Scanner(System.in);
		
		UsernameAndPassword up= (username, password) -> 
			username.equals("Ajay") && password.equals("Asdfghjkl1234@#");
		
		System.out.println("Enter User Name: ");
		String username= scn.next();
		
		System.out.println();
		System.out.println("Enter Password: ");
		String password= scn.next();
		
		System.out.println();
		System.out.println("Status: "+ up.validation(username, password));
		
		scn.close();

	}

}
