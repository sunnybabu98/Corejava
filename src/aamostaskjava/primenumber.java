package aamostaskjava;

public class primenumber {
public static void main(String[] args) {
	
	
	int limit = 100;
    System.out.println("Prime numbers between 1 and " + limit + ":");
    
    // Loop through all numbers from 2 to limit
    for (int number = 2; number <= limit; number++) {
        // Check if the number is prime
        boolean isPrime = true;
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                isPrime = false;
                break;
            }
        }
        
        // Print the prime number
        if (isPrime) {
            System.out.print(number + " ");
        }
    }
}
}