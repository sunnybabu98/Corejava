package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(9); // index 0
		al.add(5); // index 1
		al.add(7); // 2
		al.add(1); // 3
		al.add(6); // 4
		al.add(4); // 5
		al.add(2); // 6
		al.add(3); // 7
		al.add(8); // 8
		al.add(122); // 9
		al.add(99); // 10
		al.add(77); // 11
		al.add(9); // 12
		al.add(13);
		al.add(17);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
