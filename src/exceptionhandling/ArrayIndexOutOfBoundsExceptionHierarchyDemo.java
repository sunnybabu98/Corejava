package exceptionhandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionHierarchyDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:");
		int c = 0;
		
		int[] ar = new int[3];
		
		try {
			ar[0] = 9;
			ar[1] = 5;
			ar[2] = scanner.nextInt();
			c = ar[1]/ar[2];
			ar[3] = 6;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("We cannot store values beyond the size of the array");
		}catch(ArithmeticException e) {
			System.out.println("Number 0 is not allowed");
		}catch(Exception e) {
			System.out.println("Exception got handled");
		}
		
	
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

	}

}
