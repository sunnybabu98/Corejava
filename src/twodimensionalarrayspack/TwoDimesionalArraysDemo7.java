package twodimensionalarrayspack;

public class TwoDimesionalArraysDemo7 {

	public static void main(String[] args) {
		
		int[][] ar = {
					{9,5,7,1,6},
					{2,4,8,9,3},
					{1,6,9,4,2}
				}; // Shortcut representation - Tabular format
		
		for(int[] s : ar) {
			for(int e : s) {
				System.out.print(e+" "); // 9 5 7 1 6 2 4 8 9 3 1 6 9 4 2 
			}
			System.out.println();
		}

	}

}
