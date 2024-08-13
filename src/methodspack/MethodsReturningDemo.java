package methodspack;

public class MethodsReturningDemo {

	public static void main(String[] args) {
		
		int s = addThreeNumbers(1,2,3);
		System.out.println(s);	
		
        System.out.println(addThreeNumbers(1,2,3));
        

	}

	
	public static int addThreeNumbers(int a,int b,int c) {
		
		int sum;
		sum = a+b+c;
		
		return sum;
		
	}
	
	
	

}
