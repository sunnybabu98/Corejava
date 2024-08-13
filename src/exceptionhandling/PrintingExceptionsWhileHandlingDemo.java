package exceptionhandling;

public class PrintingExceptionsWhileHandlingDemo {

	public static void main(String[] args) {
		
		System.out.println("Start of the program");
		
		int a = 5, b = 0, c;
		try {
			c = a/b;
		}catch(ArithmeticException e) {
			//System.out.println("You cannot divide a number by zero");
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("End of this program.");

	}

}
