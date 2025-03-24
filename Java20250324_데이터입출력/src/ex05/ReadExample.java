package ex05;

import java.awt.im.InputContext;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		String path = "c:/data/test2.db";
		
		try {
			InputStream is = new FileInputStream(path);	
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				System.out.println(num);
				//data가 -1이면 더이상 읽어올 데이터가 없다(파일 종료)
				if(num == -1) break;
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
