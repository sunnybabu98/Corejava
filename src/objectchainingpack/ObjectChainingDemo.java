package objectchainingpack;

public class ObjectChainingDemo {

	public static void main(String[] args) {
		
//		String str = "My name is Arun Motoori";
//		String str2 = str.substring(11);
//		String str3 = str2.replace(" ","_");
//		String str4 = str3.substring(1,4);
//		int size = str4.length();
	
		System.out.println(new String("My name is Arun Motoori").substring(11).replace(" ","_").substring(1,4).length());

	}

}
