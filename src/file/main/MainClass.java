package file.main;

import java.util.Scanner;

import file.service.ServiceMember;
import file.service.ServiceMemberImpl;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServiceMember member = new ServiceMemberImpl();
		
		int num;
		while (true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 검색");
			System.out.println("3. 회원 목록 보기");
			System.out.println("4. 탈퇴");
			System.out.println("5. 종료");
			System.out.println(">>> : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				member.register();
				break;
			case 2:
				member.search();
				break;
			case 3:
				member.list();
				break;
			case 4:
				member.delete();
				break;
			case 5:
				System.out.println("프로그램 종료");
				return;
			default:
				break;
			}
		}
	}
}
