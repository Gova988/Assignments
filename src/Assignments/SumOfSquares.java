package Assignments;

import java.util.Scanner;

public class SumOfSquares {

	
	       private int sum,sqsum;
	       public int calculateDifference(int n)
	       {
	              for(int i=1;i<=n;i++)
	              {
	                     sum=sum+i;
	              }
	              sum = sum*sum;
	              for(int i=1;i<=n;i++)
	              {
	                     sqsum=sqsum+(i*i);
	              }
	              return sqsum-sum;
	       }
	       public static void main(String[] ar)
	       {
	              SumOfSquares a = new SumOfSquares();
	              Scanner s = new Scanner(System.in);
	              System.out.println("Enter a number");
	              int n = s.nextInt();
	              System.out.println(a.calculateDifference(n));
	       }
	}
	


