package findhandling2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File(System.getProperty("user.dir")+"\\Arun2.txt");
		
		//Read the text from the file using BufferedReader class
//		FileReader fr = new FileReader(f1);
//		BufferedReader br = new BufferedReader(fr);
		
		BufferedReader br = new BufferedReader(new FileReader(f1));
		
		String line = br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		
		
//		String line1 = br.readLine();
//		System.out.println(line1);
//		String line2 = br.readLine();
//		System.out.println(line2);
//		String line3 = br.readLine();
//		System.out.println(line3);
//		String line4 = br.readLine();
//		System.out.println(line4);
//		String line5 = br.readLine();
//		System.out.println(line5);
//		String line6 = br.readLine();
//		System.out.println(line6); // null
		
		
		
	}

}
