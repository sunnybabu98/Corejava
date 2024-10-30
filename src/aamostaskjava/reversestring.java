package aamostaskjava;

import java.util.Scanner;

public class reversestring {
public static void main(String[] args) {
	String str= "Sunny";
	String rev ="";
	/*int len=str.length();
	
	
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	System.out.println("Reverse String is:"   + rev);*/
	
	//charcter array 
/*	char a[]= str.toCharArray();
	int len = a.length;
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+a[i];
		
	}
	System.out.println("Reverse String is:"   + rev);*/
	
	
	StringBuffer sb = new StringBuffer(String.valueOf(str));
	
	
	System.out.println("Reverse String is:" + sb.reverse());
	
}
}
