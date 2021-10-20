package day2;

public class maxArray {
	 public static void main(String[] args) {
	        int[]  arr = {23,67,45,78,45};

	        int maxNum = arr[0];

	        for (int i : arr) {
	            if (i > maxNum)
	                maxNum = i;
	        }

	        System.out.println("Maximum number = " + maxNum);
	    }
	}


