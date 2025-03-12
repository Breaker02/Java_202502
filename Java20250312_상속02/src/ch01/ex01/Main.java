package ch01.ex01;
/*
 * 상속 저너제 조건
 * 하위 클래스는 상위 클래스 자원 저근 가능(단 private 제외)
 * 상위 클래스는 하위 클래스 접근 불가
 */

public class Main {

	public static void main(String[] args) {
		C c1 = new C("지리산", "전북 남원", 40);
		
		c1.funcA();
		c1.funcB();
		c1.funcC();
	
		B b1 = new B("남산", "서울");
		b1.funcA();
		b1.funcB();
		
		A a1 = new A("내장산");
		a1.funcA();
		System.out.println("-------자동타입변환-------");
		
		/*
		 * 상위 클래스는 하위클래스를 참조할수있다.
		 * 단. 하위클래스 자원에는 접근 불가.
		 * 자신 클래스에게만 접근 가능
		 * ex) a2.funcA(O 최상위 클래스,본인 클래스이므로 불러오기 가능)
		 * ex) a2.funcC(X C보다 상위 클래스이므로 접근 불가)
		 */
		
//		B b2 = new B("치악산", "원주");
//		A a2 = (A)b2;
		
		A a2 = new B("치악산", "원주");
		a2.funcA();
		//a2.funcB();
		
		A a3 = new C("한라산", "제주", 31);
		a3.funcA();
		
		System.out.println("-------강제타입변환-------");
		A a4 = new B("치악산", "원주");
		B b2 = new B("치악산", "원주");
		
		a4.funcA();
		b2.funcA();
		
//		int a = 10;
//		double d = 1.2;
//		d = a;
//		
//		System.out.println(a + " " + d);
//		
//		a = (int) d;
//		
//		System.out.println(a + " " + d);
		
		/* 강제타입 변환이 안되는 경우
		A a5 = new A();
		B b3 = new B();
		b3 = (B)a5;  //이것이 안됨
		b3.funcA();
		*/
		
//		A a6 = new A();
//		B b4 = new B();
//		b4 = (B)a6;
		
		A a7 = new C();
		B b5;
		b5 = (B)a7;  //OK
		
		A a8 = new C();
		C c2;
		c2 = (C)a8;  //OK
		
		A a10 = new A();
		B b6 = new B();
		a10 = b6;
		
		B b7 = (B)a10;
	}
	

}
