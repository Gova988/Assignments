package com.collectionframework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class exercise6 {

		public static void main(String[] args) {
			
			// Creating HashMap object and take id as key and age as value
			HashMap<String, Integer> map= new HashMap<>();
			
			map.put("KH68TY97", 64);
			map.put("GRR567PM", 23);
			map.put("CM645JKF", 34);
			map.put("GKMJ465J", 67);
			map.put("F45HY6J7", 45);
			map.put("F4T7H5C3", 90);
			
			// Invoking the function
			List<String> list= voterList(map);
			
			// Creating iterator to iterate the list
			Iterator<String> itr= list.iterator();
			System.out.println("Eligible ID's are: ");
			while(itr.hasNext())
				System.out.println(itr.next());

		}
		
		// Creating the method to perform whether a ID is eligible for vote or not
		public static List<String> voterList(HashMap<String, Integer> hMap) {
			
			// Creating one arraylist to store the resultant IDs
			List<String> list= new ArrayList<>();
			
			// Logic to check the age
			for(String id: hMap.keySet()) {
				int age= hMap.get(id);
				if(age>18) {
					list.add(id);
				}
			}
			return list;
		}

	}


