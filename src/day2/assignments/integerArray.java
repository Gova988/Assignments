package day2.assignments;

import java.util.Arrays;

public class integerArray {
	  public static void main(String args[]) {
    	  int[] arr= {2,8,4,8,6,9,10};
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
