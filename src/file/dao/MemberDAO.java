package file.dao;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import file.dto.MemberDTO;

public class MemberDAO {
	private String path = "D:\\2월_국비_핀테크_이태영\\Java\\members\\";
	private FileInputStream fis;
	private FileOutputStream fos;
	private BufferedInputStream bis;
	private BufferedOutputStream bos;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;

	public void register(MemberDTO dto) {
		//String p = path + dto.getId() + ".txt";
		File p = new File(path + dto.getId() + ".txt");
		if (p.exists()) {
			System.out.println("존재하는 회원입니다.");
		}else {
			try {
				fos = new FileOutputStream(p);
				bos = new BufferedOutputStream(fos);
				oos = new ObjectOutputStream(bos);

				oos.writeObject(dto);

				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("회원가입 성공");
		}
	}
	
	public String[] getList() {
		File file = new File(path);
		return file.list();
	}
	public void delete(String id) {
		File file = new File(path+id+".txt");
		if (file.exists()) {
			file.delete();
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("존재하지 않는 회원입니다.");
		}
	}
	public MemberDTO search(String id) {
		File f = new File(path+id+".txt");
		MemberDTO dto = null;
		if (f.exists()) {
			try {
				fis = new FileInputStream(f);
				bis = new BufferedInputStream(fis);
				ois = new ObjectInputStream(bis);
				dto = (MemberDTO)ois.readObject();
				ois.close(); bis.close(); fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("찾는 회원이 없습니다.");
		}
		return dto;
	}
}
