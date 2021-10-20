package day2;

import java.util.Arrays;

public class reversearray {
      public static void main(String args[]) {
    	  int[] arr= {23,45,50,67,68,70};
    	  int i=0;
    	  int j=arr.length-1;
    	  while(i<j) {
    		  int temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;
    		  i++;
    		  j--;
    		  
    	  }
    	  System.out.println(Arrays.toString(arr));
      }
}
