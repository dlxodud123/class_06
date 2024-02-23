package file.service;

import java.util.Scanner;

import file.dao.MemberDAO;
import file.dto.MemberDTO;

public class ServiceMemberImpl implements ServiceMember{
	private MemberDAO dao;
	public ServiceMemberImpl() {
		dao = new MemberDAO();
	}
	@Override
	public void register() {
		MemberDTO dto = new MemberDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		dto.setId(sc.next());
		System.out.println("이름 입력 : ");
		dto.setName(sc.next()); 
		
		dao.register(dto);
		
	}
	@Override
	public void list() {
		String[] listFile = dao.getList();
		if (listFile.length == 0) {
			System.out.println("저장된 목록이 없습니다");
		}else {
			for (int i = 0; i < listFile.length; i++) {
				System.out.println(i+1 + "." + listFile[i]);
			}
		}
	}
	@Override
	public void delete() {
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.println("삭제할 id 입력");
		id = sc.next();
		dao.delete(id);
	}
	@Override
	public void search() {
		Scanner sc = new Scanner(System.in);
		String id;
		System.out.println("검색할 id 입력");
		id = sc.next();
		MemberDTO d = dao.search(id);
		if (d != null) {
			System.out.println("id : " + d.getId());
			System.out.println("name : " + d.getName());
		}
	}
}
