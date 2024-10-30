package day8;

import java.util.Arrays;

public class StrinhMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s = "welcome";
		//String s = new String("welcome");
		//System.out.println(s);
		
		//length() ---return length of string charcters
		String s = "welcome";
		//int i = s.length();
		System.out.println(s.length());
		System.out.println("welcome".length());
		
		//concat() to use adding to strings
		
		String s1 = "welcome";
		String s2 = "to java";
		String s3 = "  and automation";
		
		
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("welcome" + "to java");
		System.out.println("welcome".concat(s2));
		
		
		//trim remove spaces right and lift side spaces
		String p = "  welcome   ";
		System.out.println(p);
		System.out.println("before triming "+p.length());
		
		System.out.println(p.trim());
		System.out.println("after trming "+p.trim().length());
		
		//charAt()   --- return charcter from a string based on index
		//index start from 0
		 s = "welcome";
		System.out.println(s.charAt(3));
		
		//contains --- returns true/false
		
		System.out.println(s.contains("wel"));//true
		System.out.println(s.contains("WEL"));//false
		System.out.println(s.contains("COME"));//false
		System.out.println(s.contains("come"));//true
		System.out.println(s.contains("Come"));//false
		
		//equals  equalIssignorecase() return compare string
		
		s1 = "welcome";
		s2 = "welcome";
		
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println("welcome".equals(s1));//true
		System.out.println("Welcome".equals(s1));//false
		System.out.println("Welcome".equalsIgnoreCase(s1));//true
		
		//replace()---return replace the single/multiple character in a string 
		s = "welcome to selenium java selenium pytthon selenium c#";
		System.out.println(s.replace('e','x'));
		
		System.out.println(s.replace("selenium","playwright"));
		
		//substring  ---extract substring from main string
        //starting index number = 0;
		//ending index number start with = 1;
		s = "selenium";
		System.out.println(s.substring(3,7));

	//toupper case to lower case
		s = "slenium is free source tool";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
	//split() string in multiple parts based on delimeter
		s ="sunnybabukusuma98@gmail.com";
		
	String a[] = s.split("@");
	System.out.println(a[0]);
	System.out.println(a[1]);	
	System.out.println(a[0]+a[1]);	
	
	System.out.println(Arrays.toString(a));
	
	String amount = "$45,25,60";
	System.out.println(amount.replace("$",""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
