package file;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		int num;
		while (true) {
			try {
				System.out.println("수 입력 : ");
				num = sc.nextInt();
				System.out.println("입력값 : " + num);
				break;
			}catch (Exception e) {
				s1 = sc.nextLine();
				System.err.println(s1 + "수 입력하세요");
			}
		}
		/*
		System.out.print("1. 문자열 입력 : ");
		s1 = sc.next();
		System.out.print("2. 문자열 입력 : ");
		s2 = sc.nextLine();
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		 */

	}
}
