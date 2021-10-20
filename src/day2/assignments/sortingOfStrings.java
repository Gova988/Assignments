package day2.assignments;

import java.util.Arrays;

public class sortingOfStrings {
	public static void main(String[] args) {
		String[] a= {"govardhan","suman","gangi reddy","sankar","mahesh"};
		int b = a.length;  
	 
		for(int i = 0; i<b-1; i++)   
		{  
		for (int j = i+1; j<a.length; j++)   
		{    
		if(a[i].compareTo(a[j])>0)   
		{   
		String temp = a[i];  
		a[i] = a[j];  
		a[j] = temp;  
	}  
}  
	}    
		System.out.println(Arrays.toString(a));  
 }  
} 
	


