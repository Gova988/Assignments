package Assignments;

import java.util.Scanner;

public class integerofprime {

	            public static void main(String args[])
	            {
	                        int n,a;
	                        Scanner scr=new Scanner(System.in);
	                        System.out.println("\nEnter n value:  ");
	                        n=scr.nextInt();
	                        System.out.println("Primenumbers are : ");
	                        for(int i=2;i<=n;i++)
	                        {
	                                    a=0;
	                                    for(int j=2;j<=i/2;j++)
	                                    if((i%j)==0)
	                                    {
	                                                a=1;
	                                                break;
	                                    }
	                        if(a==0)
	                        System.out.print(i+"   ");
	                        }
	            }
	}


