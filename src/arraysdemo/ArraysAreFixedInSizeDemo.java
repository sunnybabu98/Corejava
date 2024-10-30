package arraysdemo;

public class ArraysAreFixedInSizeDemo {

	public static void main(String[] args) {
		
		int[] ar = new int[3]; // Arrays are fixed in size
		
		ar[0] = 9;
		ar[1] = 5;
		ar[2] = 7;
	//	ar[3] = 1;  // Is this possible to increase the size of the array by doing this assignment
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);

	}

}
