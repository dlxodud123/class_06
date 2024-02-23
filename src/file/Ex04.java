package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String path = "D:/2월_국비_핀테크_이태영/Java/test/";
		
		System.out.print("파일명 입력 : ");
		String fileName = sc.next();
		
		File filepath = new File(path+fileName+".txt");
		
		if (filepath.exists()) {
			System.out.println("이미 존재하는 파일입니다.");
		}else {
			FileOutputStream fos = new FileOutputStream(filepath);
			String msg;
			System.out.println("내용을 입력하세요");
			sc.nextLine();
			msg = sc.nextLine();
			fos.write(msg.getBytes());
			System.out.println("저장 완료");
		}	
	}
}
