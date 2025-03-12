package ch01.ex01;
/*
 * 상속 저너제 조건
 * 하위 클래스는 상위 클래스 자원 저근 가능(단 private 제외)
 * 상위 클래스는 하위 클래스 접근 불가
 */

public class Main02 {

	public static void main(String[] args) {
		A a1 = new A();
		a1.test();
		
		B b1 = new B();
		b1.test();
		
		C c1 = new C();
		c1.test();
		
		System.out.println("----------");
		
		A a2 = new C();
		a2.test();
		
		A a3 = new B();
		a3.test();
		
		B b2 = new C();
		b2.test();
	}
}
