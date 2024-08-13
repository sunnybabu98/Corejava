package findhandling2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File(System.getProperty("user.dir")+"\\Arun3.txt");
		
		if(!f1.exists()) {
			f1.createNewFile();
		}
		
		//Writing text into the text file using PrintWriter class
		PrintWriter pw = new PrintWriter(f1);
		pw.println("My name is Arun Motoori.");
		pw.println("I love Java programming.");
		pw.print("Java is a popular programming language.");
		
		pw.flush();
		pw.close();
	
		System.out.println("End of this program.");

	}

}
