
package ch01.ex09;

public class A {
	String name;
	A(){}
	A(String name) {
		this.name = name;
	}
	
	void test() {
		System.out.println("A()");
	}

}

class B extends A {
	String address;
	
	B(){}
	
	B(String name, String addresss){
		super(name);
		this.address = addresss;
	}
	
	void funcB() {}
	
	@Override // 이노테이션
	void test() {
		System.out.println("B()");
	}
}

class C extends B {
	int age;
	C(){}
	
	C(String name, String address, int age) {
		super(name, address);
		this.age = age;
	}
	
	@Override // 이노테이션
	void test() {
		System.out.println("C()");
	}
}
