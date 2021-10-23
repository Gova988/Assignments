package test2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern {
	public static void main(String[] args) {
	String s2="020-26231407";
	System.out.println(Pattern.matches("[0-9]{3}-[0-9]{8}", s2));
	
	String s3="186 023 31407";
	System.out.println(Pattern.matches("[0-9]{3}.[0-9]{3}.[0-9]{5}", s3));
	
	String s4="flyingreturn.base@airindia.in";
	String s5="govardhan@gmail.com";
	String s6="star.retros@airIndia.in";
	System.out.println(Pattern.matches("\\w{2,}\\.\\w{4,}@\\w{5,}\\.\\w{2,}", s6));
	
	String s7="MTNL / BSNL";
	String s7Pattern="[a-zA-Z]{4,}\\s\\/\\s[a-zA-Z]{1,5}";
//	System.out.println(Pattern.matches("\\w{1,}\\/\\w{1,}",s7));
	String str6="+ 91 124 26414007(International call to be applicable)";
    String pattern="\\+\\s\\d{2}\\s\\d{3}\\s(\\d{7})\\s\\(International call to be applicable)";
  
  	  System.out.println("sucess");
	Pattern p1=Pattern.compile(s7Pattern);
	Matcher m1=p1.matcher(s7);
	System.out.println(m1.matches());
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