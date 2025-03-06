package ch01.ex03;

public class PersonMain {

	public static void main(String[] args) {
		//이름, 나이, 전화번호만 입력하시고, 
		//메소드 호출해서 출력
		
		Person ps = new Person("최순정", 24, "010-3333-6444");
		
		ps.이름출력();
		ps.나이출력();
		ps.전화번호출력();
		
		Person p2 = new Person("홍길동", -5, "1111-2222");
		p2.이름출력();
		p2.나이출력();
		p2.전화번호출력();
	}

}
