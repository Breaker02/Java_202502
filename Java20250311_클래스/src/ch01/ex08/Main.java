package ch01.ex08;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		a.funcA();
		
		B b = new B();
		b.funcB();
		
		B b2 = new B("지리산", 50, "전라남도 남원시");
		
		b2.info();
		
	}

}
