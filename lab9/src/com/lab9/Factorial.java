package com.lab9;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		FactIntrf fact = (num) -> {
			int result = 1;
			for (int i = 0; i <= num; i++) {
				if (i == 0)
					result = 1;
				else {
					result *= i;
				}
			}
			return result;
		};

		System.out.println("Enter a number: ");
		int num = scn.nextInt();
		System.out.println("Factorial of " + num + " is: " + fact.getFact(num));

		scn.close();

	}
}
