package overloadingpack.method;

public class Calculations {
	
	public void add() {
		
		System.out.println("Nothing to Add");
		
	}
	
	public void add(int a) {
		
		System.out.println("We cannot add single number: "+a);
		
	}
	
	public void add(double a) {
		
		System.out.println("We cannot add single number: "+a);
		
	}
	
	public void add(int a,int b) {
		
		System.out.println("Addition of two numbers is: "+(a+b));
		
	}
	
	public void add(int a,double b) {
		
		System.out.println("Addition of two numbers is: "+(a+b));
		
	}
	
	public void add(double a,double b) {
		
		System.out.println("Addition of two numbers is: "+(a+b));
		
	}
	
	public void add(double a,int b) {
		
		System.out.println("Addition of two numbers is: "+(a+b));
		
	}
	
}
