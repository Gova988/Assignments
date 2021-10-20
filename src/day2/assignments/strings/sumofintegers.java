package day2.assignments.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class sumofintegers {
	 public static void main(String args[])
	   {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("\nEnter sequence of integers ");
	      String digit=sc.nextLine();
          StringTokenizer token=new StringTokenizer(digit);
	      int a=0,sum=0;
	      System.out.println("\nEntered digits are : ");
	       while(token.hasMoreTokens())
	       {
	    	   String s=token.nextToken();
	           a=Integer.parseInt(s);
	           System.out.print(a+" ");
	           sum=sum+a;
	       }
	              System.out.println();
	              System.out.println("Sum is : "+sum);
	   }
}
	


