package file;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String path = "D:/2월_국비_핀테크_이태영/Java/test/test2.txt";
		
		FileOutputStream fos = new FileOutputStream(path);
		
		System.out.println("출력할 내용 입력 : ");
		String name = sc.next();
		fos.write(name.getBytes());
		System.out.println("저장되었습니다.");
		
	}
}
