package day2.assignments.strings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class numberOfCharacters {
	 public static void main(String args[]) throws IOException
     {
                 int a=1,b=0;           
                 char ch;
                 Scanner scr=new Scanner(System.in);
                 System.out.print("\nEnter File name: ");
                 String str=scr.nextLine();
                 FileInputStream f=new FileInputStream(str);
                 int n=f.available();
                 for(int i=0;i<n;i++)
                 {
                             ch=(char)f.read();
                             if(ch=='\n')
                             a++;
                             else if(ch==' ')
                                         b++;
                                                                
                 }
                 System.out.println("\nNumber of lines : "+a);
                 System.out.println("\nNumber of words : "+(a+b));
                 System.out.println("\nNumber of characters : "+n);
                

     }


}
