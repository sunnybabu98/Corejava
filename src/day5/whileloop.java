package day5;

public class whileloop {

	public static void main(String[] args) {
		//example 1 print 1 to 10 numbers
		/*int i = 1;//intialization
		
		while(i<=10) {  //condition
			
			System.out.println(i);
			i++;//increment
			
			
		}*/
		//example 2 printing hello in 10 times
	/*	int i=1;
		while(i<=10) {
			System.out.println("hello");
			i++;
		}*/
		//example 3 print even numbers
	/*	int i=1;
		while(i<=100) {
			if(i%2==0) {
			System.out.println(i);
			}
		     i++; }*/
		
		int i=1;
		while(i<=100) {
			if(i%2==0) {
			System.out.println(i+  "even");
			}else {
				System.out.println(i  +"odd");
			}
		     i++; }
		
	}
}
