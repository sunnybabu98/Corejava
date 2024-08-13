package objectclass;

import java.io.File;

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		Object obj1 = new Integer(10);
		System.out.println(obj1);
		
		Object obj2 = new String("Arun Motoori");
		System.out.println(obj2);
		
		Object obj3 = new File("abc.txt");
		System.out.println(obj3);
		
		Byte a = 5;
		Short b = 10;
		Integer c = 555;
		Long d = 5555L;
		Float e = 12.34F;
		Double f = 12.34;
		Character g = 's';
		Boolean h = true;
		
		Object a1 = a;
		Object b1 = b;
		Object c1 = c;
		Object d1 = d;
		Object e1 = e;
		Object f1 = f;
		Object g1 = g;
		Object h1 = h;
		
		Object x = "Arun Motoori";
		
	}

}
