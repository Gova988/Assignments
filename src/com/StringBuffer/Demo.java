package com.StringBuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
	public static void main(String[] args) {
	String str1="flyingreturn.base@airindia.in";
	String str2=" star.retros@airindia.in";
	System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.", str1));
    String str3="   020-26231407";

    System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}",str3)); 
    String str4="  1860 233 1407";
    System.out.println(Pattern.matches("[0-9]{4,8}|[0-9]{6,8}[0-9]{6,8}.*", str4)); 
     String str5="MTNL / BSNL";
      System.out.println(Pattern.matches("\\w{3},\\\\w{2,}\\.\\w{1}",str5));
      String str6="+ 91 124 26414007(International call to be applicable)";
      String pattern="\\+\\s\\d{2}\\s\\d{3}\\s(\\d{7})\\s\\(International call to be applicable)";
      Pattern p1=Pattern.compile(pattern);
      Matcher m1=p1.matcher(str6);
      System.out.println(m1.matches());
      System.out.println(m1.group(0));
      System.out.println(m1.group(1));
      if(m1.group(1).equals("2641407")) {
    	  System.out.println("sucess");
      }
      else {
    	  System.out.println("failure");
      }
      
      
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
    		  
	}
}
