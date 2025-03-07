package ch01.ex02;

public class PersonMain {

	public static void main(String[] args) {
		//이름, 나이, 전화번호만 입력하시고, 
		//메소드 호출해서 출력
		
		Person ps = new Person();
		
		ps.age = 24;
		ps.phone = "010-1111-2222";
		ps.name = "최순정";
		
		ps.나이출력(ps.age);
		ps.전화번호출력(ps.phone);
		ps.이름출력(ps.name);
		
	}

}
