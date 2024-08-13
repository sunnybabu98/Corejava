package variablestypespack;

public class LocalGlobalVariablesDemo {
	
	static int a = 10; // global variable
	static int b = 20; // global variable
	static int c = 30; // global variable

	public static void main(String[] args) {
		
		int m = 5; // local variable
		int n = 6; // local variable
		int p = 7; // local variable
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
	}
	
	public static void sample() {
		
//		System.out.println(m);
//		System.out.println(n);
//		System.out.println(p);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	
	//Assignment - Create parameters for a method and try to access them outside the method

}
