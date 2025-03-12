package ch01.ex01;

public class A {
	String name;
	A(String name) {
		this.name = name;
	}
	A(){}
	
	void test() {
		System.out.println("A class");
	}
	void funcA() {
		System.out.println("funcA()");
	}
}

class B extends A {
	String address;
	B(){}
	B(String name, String address){
		super(name);
		this.address = address;
	}
	void test() {
		System.out.println("B class");
	}
	
	void funcB() {
		System.out.println("funcB()");
	}
}

class C extends B {
	int age;
	
	C(String name, String address, int age){
		super(name, address);
		this.age = age;
	}
	C(){}
	
	void test() {
		System.out.println("C class");
	}
	
	void funcC() {
		System.out.println("funcC()");
	}
}
