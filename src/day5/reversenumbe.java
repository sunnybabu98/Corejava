package day5;

import java.util.Scanner;

public class reversenumbe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number");
		
		int num = sc.nextInt();
		StringBuffer rev;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
				
		
		System.out.println("reverse of number:"+ rev);
		

	}

}
