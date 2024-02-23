package file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String path = "D:/2월_국비_핀테크_이태영/Java/test/test.txt";
		FileOutputStream fos = new FileOutputStream(path, true);
		fos.write('c');
		fos.close();
		fos = new FileOutputStream(path, true);
		fos.write('d');
		fos.close();
		
		FileInputStream fis = new FileInputStream(path);
		int re = fis.read();
		System.out.println((char)re);
		while (true) {
			re = fis.read();
			if (re < 0) {
				System.out.println("내용이 없습니다." + re);
				break;
			}
			System.out.println((char)re);
		}
		fis.close();
	}
}
