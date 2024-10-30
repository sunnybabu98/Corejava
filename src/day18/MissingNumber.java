package day18;

public class MissingNumber {

	public static void main(String[] args) {

		  //int a[] = {1,2,3,4,5,7,8,9,10,........100};
		  //1+2+4+5 = 12
		  //1+2+3+4+5 = 15
		  //15-12 = 3
		      
		  int a[] = {-1,0,1,2,4,5,6,7,8,9,10};
		 
		// Step 1: Find the sum of elements in the given array
	        int sum = 0;
	        for(int i = 0; i < a.length; i++) {  // Fixed the loop condition
	            sum = sum + a[i];  // Sum of array elements
	        }
	        System.out.println("Sum of array elements: " + sum);  // Output: 49

	        // Step 2: Find the sum of a full sequence (from -1 to 10)
	        int sum1 = 0;
	        for(int j = -1; j <= 10; j++) {  // Sum of complete range
	            sum1 = sum1 + j;  // Expected sum for complete range
	        }
	        System.out.println("Sum of complete sequence: " + sum1);  // Output: 55

	        // Step 3: Find the missing number by subtracting the two sums
	        System.out.println("Missing number is: " + (sum1 - sum));  // Output: 3
	    }
	}