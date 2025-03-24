package ex08;

import java.io.*;

public class BufferExample {
	public static void main(String[] args) throws Exception {
//		String originalPath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
		String originalPath1 = "c:/data/originalFile1.jpg";
		String targetPath1 = "c:/test/tragetFile1.jpg";
		
		FileInputStream fis = new FileInputStream(originalPath1);
		FileOutputStream fos = new FileOutputStream(targetPath1);
		
//		String originalPath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
		String originalPath2 = "c:/data/originalFile2.jpg";
		String targetPath2 = "c:/test/tragetFile2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalPath2);
		FileOutputStream fos2 = new FileOutputStream(targetPath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis,fos);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용:\t" + bufferTime + " ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	private static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();
		return (end-start);
	}
}
