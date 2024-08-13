package findhandling2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File(System.getProperty("user.dir")+"\\Arun1.txt");
		
		if(!f1.exists()) {
			f1.createNewFile();
		}
		
		//Writing text into the text file using FileWriter class
		
		FileWriter fw = new FileWriter(f1);
		fw.write("My name is Arun Motoori.\nI am the founder at QAFox.com\nI love Java programming.\nI create content on Software Testing Tools.\nI love teaching.\nI am a corporate trainer and Udemy instructor too.");
		fw.write("\nThis is an updated text");
		fw.flush();
		fw.close();
		System.out.println("End of this program.");

	}

}
