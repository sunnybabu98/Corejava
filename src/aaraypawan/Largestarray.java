package aaraypawan;

public class Largestarray {

	public static void main(String[] args) {
		int[] numbers = {4, 2, 7, 1, 9};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {

                largest = numbers[i];

            }

        }

        System.out.println("Largest Element: " + largest);

    }

}
