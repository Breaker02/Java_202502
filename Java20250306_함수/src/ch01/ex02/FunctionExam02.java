package ch01.ex02;

/*
 * 함수 2개 생셩
 * 매개변수로 100 정수값을 전달하면
 * 함수 1은 1~100 사이의 홀수 값을 리턴
 * 함수 2는 1~100 사시의 짝수 값을 리턴
 * 메인함수에서 두 값을 호출하고, 각 전달 값을 출력한다.
 */


public class FunctionExam02 {
	public static void main(String[] args) {
		int[] number = new int[10];
		
	
		for(int i = 0; i<10; i++) {
			number[i] = (i+1)*10;
		}
		
		for(int i = 0; i<10; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		int resultA = even(number);
		System.out.println("짝수:"+resultA);
		
		int resultB = odd(number);
		System.out.println("홀수:"+resultB);
		
	}
	public static int even(int[] number) {
		int even = 0;
		for (int i = 0; i < number.length; i++) {
			int num = number[i] / 10;
			if(num % 2 == 0) {
				even += number[i];
			}
		}
		return even;
	}
	public static int odd(int[] number) {
		int odd = 0;
		for (int i = 0; i < number.length; i++) {
			if((number[i] / 10) % 2 == 1) {
				odd += number[i];
			}
		}
		return odd;
	}
}
