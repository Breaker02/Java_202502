package ch01.ex05;
/*
 * static(정적) <==> 인스턴스
 * 인스턴스 변수, 인스턴스 메소드
 * 정적변수, 정적메소드
 */

public class Person {
	private String name;
	private int age;
	
	static int count;  // 정적변수
	
	static void f1() {
		//stataic에 붙어있는 아이는 static에 들어간 아이만 사용가능
	}
	static void func() {
		System.out.println("정적메소드 func()");
		count++;
		f1();
		//age++;
		//eat();
	}
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	String displayInfo() {
		return name + " : " + age;
	}
	
	void run() {
		count++;
		func();
		eat();
		age++;
		System.out.println("run");
	}
	
	void eat() {
		System.out.println("eat");
	}
	
}
