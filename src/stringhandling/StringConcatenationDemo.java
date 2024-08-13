package stringhandling;

public class StringConcatenationDemo {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		System.out.println(a+b); // Addition - 15
		
		String firstName = "Arun";
		String lastName = "Motoori";
		System.out.println(firstName+" "+lastName); // Concatenation operator
		
		int c = 9;
		System.out.println(firstName+9); // Concatenation
		
		int d = 1;
		System.out.println(d+firstName); // Concatenation 
		
		System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));

	}

}
