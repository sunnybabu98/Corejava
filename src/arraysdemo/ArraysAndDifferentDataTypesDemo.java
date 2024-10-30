package arraysdemo;

import java.util.Arrays;

public class ArraysAndDifferentDataTypesDemo {

	
	
		    public static void main(String[] args) {
		        int[] ar = {9, 1, 5, 7};
		        Integer[] ar2 = {9, 1, 5, 7};

		        double[] ar3 = {1.2, 3.4, 5.6, 7.8};
		        Double[] ar4 = {1.2, 3.4, 5.6, 7.8};

		        char[] ar5 = {'a', 'b', 'c', 'd'};
		        Character[] ar6 = {'a', 'b', 'c', 'd'};

		        boolean[] ar7 = {true, false, false, true, false};
		        Boolean[] ar8 = {true, false, false, true, false};

		        Object[] ar9 = {9, 1.5, true, 's', "Arun Motoori"};

		        System.out.println(Arrays.toString(ar));
		        System.out.println(Arrays.toString(ar6));
		        System.out.println(Arrays.toString(ar2));
		        System.out.println(Arrays.toString(ar3));
		        System.out.println(Arrays.toString(ar4));
		        System.out.println(Arrays.toString(ar5));
		        System.out.println(Arrays.toString(ar7));
		        System.out.println(Arrays.toString(ar8));
		        System.out.println(Arrays.toString(ar9));
		    }
		}



