package day20;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declaration
		ArrayList<Comparable> mylist = new ArrayList();
		//List my = new ArrayList();
		ArrayList<Integer>in = new ArrayList<Integer>();
		
		
		//adding data
		mylist.add(105);
		mylist.add("welcome");
		mylist.add("welcome my world");
		mylist.add(105);
		mylist.add(105.22);
		mylist.add(null);
		mylist.add(null);
		in.add(123);
		//Size of array
		System.out.println("size of arraay is :"+mylist.size());
		
		//print of array
		System.out.println("length of array is:"+mylist);//length of array is:[105, welcome, welcome my world, 105, 105.22, null, null]

		
		//remove from array 
		mylist.remove(3);
		mylist.remove(5);
		System.out.println("after remove length of array is:"+mylist);//after remove length of array is:[105, welcome, welcome my world, 105.22, null]
		
		//insert in to element array
		mylist.add(3,"selenium");
		System.out.println("after remove length of array is:"+mylist);
		
		//modify in array list
		mylist.set(2,"i love my country");
		System.out.println("modify in array:"+mylist);
		
		//access of specific element
		
		System.out.println("specific element:"+mylist.get(3));
		
		//each for loop
		/*for(int i=0;i<mylist.size();i++) {
			System.out.println(mylist.get(i));
		}*/
		//using each for loop
		
		for(Object x:mylist) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
