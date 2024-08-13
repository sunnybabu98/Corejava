package findhandling2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File(System.getProperty("user.dir")+"\\Arun2.txt");
		
		if(!f1.exists()) {
			f1.createNewFile();
		}
		
		//Writing text into the text files using BufferedWriter class
//		FileWriter fw = new FileWriter(f1);
//		BufferedWriter bw = new BufferedWriter(fw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		bw.write("My name is Arun Motoori.");
		bw.newLine();
		bw.write("I love Java programming.");
		bw.newLine();
		bw.write("Java is a popular program language");
		bw.newLine();
		bw.write("I am the founder at QAFox.com website.\nI am also a corporate trainer and Udemy Instructor.");
		
		bw.flush();
		bw.close();
		
		System.out.println("End of this program.");
	

	}

}
