package ch01.ex02;

/*
 * 함수 2개 생셩
 * 매개변수로 100 정수값을 전달하면
 * 함수 1은 1~100 사이의 홀수 값을 리턴
 * 함수 2는 1~100 사시의 짝수 값을 리턴
 * 메인함수에서 두 값을 호출하고, 각 전달 값을 출력한다.
 */


public class FunctionExam01 {
	public static void main(String[] args) {
		int number = 100;
		
		int evenResult = even(number);
		int oddResult = odd(number);
		
		System.out.println("짝수합: " + evenResult);
		System.out.println("홀수합: " + oddResult);
	}
	public static int even(int num) {
		int even = 0;
		for (int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				even += i;
			}
		}
		return even;
	}
	public static int odd(int num) {
		int odd = 0;
		for (int i = 0; i <= num; i++) {
			if(!(i % 2 == 0)) {
				odd += i;
			}
		}
		return odd;
	}
}
