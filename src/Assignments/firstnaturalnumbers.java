package Assignments;

import java.util.Scanner;

public class firstnaturalnumbers {

	 int s=0;
    public int calculateSum(int n)
    {
           for(int i=0;i<=n;i++)
           {
                  if(i%3==0||i%5==0)
                  {
                        s+=i;
                  }
           }
           return s;
    }
    public static void main(String[] args)
    {
    	firstnaturalnumbers p1 = new firstnaturalnumbers();
           Scanner s = new Scanner(System.in);
           int n=s.nextInt();
           System.out.println(p1.calculateSum(n));
    }
}

	


