package file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex09_01 {
	public static void main(String[] args) throws Exception {
		
		String path = "D:/2월_국비_핀테크_이태영/Java/test/test.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		
		Ex09DTO dto = (Ex09DTO)ois.readObject();
		
		String name = dto.getName();
		String addr = dto.getAddr();
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + addr);
		
		
	}
}
