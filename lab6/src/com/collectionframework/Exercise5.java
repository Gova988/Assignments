package com.collectionframework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size:");
		int size = sc.nextInt();

		Integer[] arr = new Integer[size];

		System.out.println("Enter " + size + " elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// closing of resource
		sc.close();

		int result = getSecondSmallest(arr);

		System.out.println("Second smallest element in list: " + result);

	}

	public static int getSecondSmallest(Integer[] arr) {

		List<Integer> list = Arrays.asList(arr);
		Collections.sort(list);

		return list.get(1);
	}

}


