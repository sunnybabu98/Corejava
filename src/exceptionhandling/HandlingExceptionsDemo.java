package exceptionhandling;

public class HandlingExceptionsDemo {

	public static void main(String[] args) {
		
		System.out.println("Start of the program.");
		System.out.println("Start of the program.");
		System.out.println("Start of the program.");
		
		int a = 9,b=0,c;
		try {
		 c = a/b;
		 System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception got handled here");
		}
		
		System.out.println("End of this program");
		System.out.println("End of this program");
		System.out.println("End of this program");

	}

}
