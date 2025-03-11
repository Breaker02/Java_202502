package ch01.ex02;

public class MainPerson {

	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = new Person();
		
		person = person2;
		
		int n = 1;
		int n2 = 10;
		n = n2;
		
		/*
		 * p1, p2는 참조하는 객체를 동시에 참조하게 된다.
		 * 
		 * p1이 참조한 객체는 일정 시간 지나면 메모리 공간에서 소실된다.(가비지)
		 */
		
		System.out.println(n);
		System.out.println(n2);
		
		person.run();
		person.eat();
	}

}
