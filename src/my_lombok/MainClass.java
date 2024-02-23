package my_lombok;

public class MainClass {
	public static void main(String[] args) {
		MainDTO dto = new MainDTO();
		dto.setName("홍길동");
		dto.setAge(24);
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto);
	}
}
