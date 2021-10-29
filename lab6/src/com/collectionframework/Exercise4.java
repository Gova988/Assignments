package com.collectionframework;

import java.util.HashMap;
import java.util.Set;

public class Exercise4 {

		public static HashMap<String, String> getStudent(HashMap<String, Integer> stu) {
			HashMap<String, String> Medal = new HashMap<>();
			Set<String> set = stu.keySet();
			for (String s : set) {
				Integer marks = stu.get(s);
				if (marks >= 90) {
					Medal.put(s, "Gold");
				} else if (marks >= 80 && marks < 90) {
					Medal.put(s, "Silver");
				} else if (marks >= 70 && marks < 80) {
					Medal.put(s, "Bronze");
				}
			}
			return Medal;
		}

		public static void main(String[] args) {
			HashMap<String, Integer> student = new HashMap<>();
			Exercise4 sc = new Exercise4();

			student.put("Govardhan:", 83);
			student.put("Suman:", 75);
			student.put("Gangi reddy:",80);
			student.put("mahesh:", 91);
			student.put("sankar:", 71);
			System.out.println(sc.getStudent(student));
		}

	}


