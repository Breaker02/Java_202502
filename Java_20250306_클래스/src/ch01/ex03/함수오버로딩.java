package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		functionA();
		functionA(10);
		functionA(10.2);
		functionA(10,20);
	}
	public static void functionA() {
		System.out.println("functionA()");
	}
	public static void functionA(int n) {
		System.out.println("functionA(int n)");
	}
	public static void functionA(double n) {
		System.out.println("functionA(double n)");
	}
	public static void functionA(int n, int n2) {
		System.out.println("functionA(int n, int n2)");
	}
}
