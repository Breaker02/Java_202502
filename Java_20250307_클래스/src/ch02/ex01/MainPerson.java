package ch02.ex01;

public class MainPerson {

	public static void main(String[] args) {
		Person p1 = new Person("개똥이");
		// p1.name = "김대철" // 멤버변수는 private 이므로 외부 접근 불가

		// p1.run(); //외부 접근 불가
		p1.eat();

		Person p2 = new Person("홍길동", 24, "010-1234-5678");
		p2.eat();

		//Person p3 = new Person();
		p2.setNname("까미");
		p2.eat();
		p2.setAge(100);
		
		String name = p2.getName();
		int age = p2.getAge();
		System.out.println(name);
		System.out.println(age);
	}
}
