package ch01.ex06;
/*
 * static(정적) <==> 인스턴스
 * 인스턴스 변수, 인스턴스 메소드
 * 정적변수, 정적메소드
 */

public class Person {
	private String name;
	private int id;
	
	static int count;  // 정적변수
	
	static void f1() {
		//stataic에 붙어있는 아이는 static에 들어간 아이만 사용가능
	}
	static void func() {
		count++;
		f1();
	}
	
	public Person (String name, int id) {
		this.name = name;
		this.id = id;
		
	}

	String displayInfo() {
		return name + " : " + id;
	}
	
	void run() {
		System.out.println("이름: " + name + "학번: " + id);
		func();
	}
	
	
}
