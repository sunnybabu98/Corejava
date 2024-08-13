package overloadingpack.constructor;

public class Calc {
	
	public Calc() {
		System.out.println("There is nothing to calculate");
	}
	
	public Calc(int a) {
		System.out.println("We cannot add a single number "+a);
	}
	
	public Calc(double a) {
		System.out.println("We cannot add a single number "+a);
	}
	
	public Calc(int a,int b) {
		System.out.println("Addition calculation of two numbers is "+(a+b));
	}
	
	public Calc(int a,double b) {
		System.out.println("Addition calculation of two numbers is "+(a+b));
	}
	
	public Calc(double a,int b) {
		System.out.println("Addition calculation of two numbers is "+(a+b));
	}
	
	public Calc(double a,double b) {
		System.out.println("Addition calculation of two numbers is "+(a+b));
	}
	
}
