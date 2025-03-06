package ch01.ex01;

/*
 * 함수
 * 입력(매개변수)		출력(반환값)
 * 	O				  O
 * 	O				  X
 * 	X				  O
 * 	X				  X
 * 
 * 	함수 정의 -> 함수를 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는 것
 */

public class 함수매개변수있고반환값있는경우 {

	public static void main(String[] args) {
		sum(false);  // sum 함수 호출
		System.out.println("프로그램 종료!!");
	}
	//함수 정의
	public static void sum(boolean flag) {
		// 코드 구현
		System.out.println("void sum() 함수 호출!!");
		System.out.println();
	}
	
}
