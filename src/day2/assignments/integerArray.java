package day2.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class integerArray {
	public static int[] getSorted(int a[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n-1;j++) {
				 if(a[i]<a[j]) {
		    		  int temp=a[i];
		    		  a[i]=a[j];
		    		  a[j]=temp;
				
			}
			
		}
	}
		return a;
	}
	  public static void main(String args[]) {
    	  Scanner scn=new Scanner(System.in);
    	  System.out.println("enter the range :");
    	  int n=scn.nextInt();
    	  int[] a=new int[n];
    	  for(int i=0;i<n;i++) {
    		  System.out.println("enter the elements:");
    		  a[i]=scn.nextInt();
    	 
    		  
    	  }
    	  System.out.println(getSorted(a,n));
      }

}
