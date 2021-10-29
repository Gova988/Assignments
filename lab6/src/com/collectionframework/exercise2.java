package com.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class exercise2 {


	public static void main(String[] args) {

		String str1 = "collections";
		countChars(str1);
	}

	static void countChars(String input) {
		HashMap<Character, Integer> characterCountMap = new HashMap<Character, Integer>();
		// Conversion of input string to array of characters
		char[] strArray1 = input.toCharArray();

		// to access each element from array
		for (char cKey : strArray1) {
			if (characterCountMap.containsKey(cKey)) {
				characterCountMap.put(cKey, characterCountMap.get(cKey) + 1);
			} else {
				characterCountMap.put(cKey, 1);
			}
		}

		// printing the charCountMap
		for (Map.Entry entry : characterCountMap.entrySet()) {
			System.out.println(entry.getKey() + "" + entry.getValue());
		}

	}
}


