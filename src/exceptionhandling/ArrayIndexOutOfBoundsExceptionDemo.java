package exceptionhandling;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		
		int[] ar = new int[3];
		
		try {
			ar[0] = 9;
			ar[1] = 5;
			ar[2] = 7;
			ar[3] = 6;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("We cannot store elements into array beyound its size");
		}
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		System.out.println("End of this program");

	}

}
