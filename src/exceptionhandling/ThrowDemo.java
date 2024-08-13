package exceptionhandling;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}else {
			throw new Exception("Your age should be atleast 18 for voting eligibility");
		}
		
		System.out.println("End of this program");
	}

}
