package exceptionhandling;

public class ArithmeticExcpetionHierarchDemo {

	public static void main(String[] args) {
		
		System.out.println("Start of the program");
		
		int a = 5, b = 0, c;
		try {
			c = a/b;
			System.out.println(c);
		}catch(Throwable e) {
			System.out.println("We cannot divide a number by zero");
		}
		
		
		System.out.println("End of the program");

	}

}
