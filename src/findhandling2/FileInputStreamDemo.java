package findhandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File(System.getProperty("user.dir")+"\\Arun4.txt");
		
		//Read the text from the text file using FileInputStream class
		
		FileInputStream fis = new FileInputStream(f1);
		
		int n = fis.read();
		
		while(n!=-1) {
			char c = (char)n;
			System.out.print(c);
			n = fis.read();
		}
		
//		System.out.println((char)fis.read());
		

	}

}
