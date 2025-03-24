package ex03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Person{}

public class WirteExample {
	public static void main(String[] args) {
		
		String path = "c:/data/test3.db";
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream(path);
			byte[] a = {10,20,30,40,50};
			
			os.write(a);

			os.flush();
			
			os.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
