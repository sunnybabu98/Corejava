package stringhandling;

import java.util.Scanner;

public class IndexOfDemoTwo {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter your name:");
//		String userInput = scanner.nextLine();
//		System.out.println(userInput);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any word:");
		String userInput = scanner.nextLine();
		String str = "I love Java programming.";
		
		if(str.indexOf(userInput)!=-1) {
			System.out.println("Your word is found in the string text");
		}else {
			System.out.println("Entered word is not available in the string text");
		}
		
	
	}

}
