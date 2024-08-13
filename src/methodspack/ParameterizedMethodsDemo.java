package methodspack;

public class ParameterizedMethodsDemo {

	public static void main(String[] args) {

		sayHello(); // No arguments
		welcomeGuest("Arun Motoori");  // 1 argument
		addTwoNumbers(5,4); // 2 arguments
	

	}

	public static void sayHello() { // No parameters

		System.out.println("Hello!");

	}

	public static void welcomeGuest(String guestName) { // 1 parameter

		System.out.println("Welcome "+guestName); // Concatenation operator

	}

	public static void addTwoNumbers(int a, int b) { // 2 parameters

		int sum;
		sum  = a+b;
		System.out.println(sum);
		System.out.println("The addition of "+a+" and "+b+" is: "+sum);
		System.out.println("The"+a+b+sum);
		
	}

}
