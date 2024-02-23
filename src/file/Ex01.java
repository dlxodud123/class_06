package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		File path = new File("D:\\2월_국비_핀테크_이태영\\Java\\test\\test1.txt");
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(97);
		fos.write('b');
		fos.write("test".getBytes());
	}
}
