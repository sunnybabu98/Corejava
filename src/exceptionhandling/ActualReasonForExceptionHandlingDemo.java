package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ActualReasonForExceptionHandlingDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter any number1: ");
			int a = scanner.nextInt();
			System.out.println("Enter another number i.e. number2:");
			int b = scanner.nextInt();
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("Second number entered cannot be 0");
		}catch(InputMismatchException e) {
			System.out.println("You have to enter numbers only");
		}
		
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
