package findhandling2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File(System.getProperty("user.dir")+"\\Arun4.txt");
		
		if(!f1.exists()) {
			f1.createNewFile();
		}
		
		//Write text into the text file using FileOuputStream class
		
		FileOutputStream fos = new FileOutputStream(f1);
		String text = "My name is Arun Motoori.\nI love Java Programming.\nJava is a popular programming langauge.";
		fos.write(text.getBytes());
		fos.flush();
		fos.close();
		
		System.out.println("End of this program.");

	}

}
