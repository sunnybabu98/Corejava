package overloadingpack.constructor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Demo {

	public static void main(String[] args) {
		
		new Calc();
		new Calc(5);
		new Calc(5.5);
		new Calc(5,4);
		new Calc(5,5.5);
		new Calc(5.5,5);
		new Calc(5.5,5.5);
		
//		File file = new File("abc.txt");
//		FileReader fr = new FileReader(file);
//		BufferedReader br = new BufferedReader(fr);

	}

}
