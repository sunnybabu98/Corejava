package twodimensionalarrayspack;

public class TwoDimesionalArraysDemo5 {

	public static void main(String[] args) {
		
		int[][] ar = {
					{9,5,7,1,6},
					{2,4,8,9,3},
					{1,6,9,4,2}
				}; // Shortcut representation - Tabular format
		
		for(int i=0;i<ar.length;i++) {  // 0
			for(int j=0;j<ar[i].length;j++) { // 0
				System.out.print(ar[i][j]+" "); // 9 5 7 1 6 2 4 8 9 3 1 6 9 4 2
			}
			System.out.println();
		}

	}

}
