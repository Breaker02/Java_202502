package ch01.ex01;

public class 복습 {

	public static void main(String[] args) {
		// 자료형 변수(초기값)
		int num = 0;
		int num2 = 0;
		int num3 = 0;
		
		num = num + 1;  // num(1)
		
		num += 1;  // num(2)
		
		num2 = ++num;  // num(3), 전위연산자(증감)
		
		num3 = num++; // num(4), 후위연산자(증감)
		
		System.out.printf("%d %d %d", num, num2, num3);
	}

}
