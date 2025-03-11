package ch01.ex01;

public class Function02 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1, num2);
		
		System.out.println("result = " + result);

	}

	static int add(int num1, int num2) {
		return num1 + num2;
	}

}
