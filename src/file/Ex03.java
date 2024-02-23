package file;

import java.io.File;

public class Ex03 {
	public static void main(String[] args) {
		String sPath = "c:/test/";
		File fpath = new File("D:/2월_국비_핀테크_이태영/Java/abcd/");
		fpath.mkdir();
		fpath.delete();
		
		fpath = new File("D:/2월_국비_핀테크_이태영/Java/");
		String[] s = fpath.list();
		System.out.println(s.length);
		for (String ss : s) {
			System.out.println(ss);
		}
		System.out.println(fpath.exists());
	}
}
