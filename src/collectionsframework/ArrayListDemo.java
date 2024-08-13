package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {

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
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(6));
		System.out.println(al.get(7));
		System.out.println(al.get(8));
		System.out.println(al.get(9));
		System.out.println(al.get(10));
		System.out.println(al.get(11));
		System.out.println(al.get(12));

	}

}
