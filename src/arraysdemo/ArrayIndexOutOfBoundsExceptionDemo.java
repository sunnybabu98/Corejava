package arraysdemo;

public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		
		int[] ar = new int[3];
		
		ar[0] = 9;
		ar[1] = 5;
		ar[2] = 7;
		
//		for(int i=0;i<=3;i++) {
//			System.out.println(ar[i]);
//		}
		

		//ar[3] = 1; // Here no compiler error, rather when you run you will get ArrayIndexOutOfBoundsException run time
		
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
//		System.out.println(ar[3]);

	}

}
