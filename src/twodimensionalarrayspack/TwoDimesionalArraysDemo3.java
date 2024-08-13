package twodimensionalarrayspack;

public class TwoDimesionalArraysDemo3 {

	public static void main(String[] args) {
		
		int[][] ar = {{9,5,7,1,6},{2,4,8,9,3},{1,6,9,4,2}}; // Shortcut representation
		
		for(int i=0;i<3;i++) {  // 3
			for(int j=0;j<5;j++) { // 0
				System.out.println(ar[i][j]); // 9 5 7 1 6 2 4 8 9 3 1 6 9 4 2
			}
		}

	}

}
