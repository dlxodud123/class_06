package file;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		String path = "D:/2월_국비_핀테크_이태영/Java/test/test.txt";
		FileOutputStream fos = new FileOutputStream(path);
//		fos.write('a');
//		fos.write('b');
//		fos.write('c');
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		for(char ch = '0'; ch <= '9'; ch++) {
			Thread.sleep(100);
			//fos.write(ch);
			bos.write(ch);
		}
		bos.flush();
		bos.write('a');
		
		bos.close();
		fos.close();
	}
}
