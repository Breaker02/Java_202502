package ex07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

class Person{}

public class WirteExample {
	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("c:/data/test.txt");
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			writer.write("FGH");
			writer.flush();
			writer.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	}
}
