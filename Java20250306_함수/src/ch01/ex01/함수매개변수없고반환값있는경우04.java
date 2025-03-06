package ch01.ex01;

/*
 * 함수
 * 입력(매개변수)		출력(반환값)
 * 	O				  O -> 03클래스
 * 	O				  X -> 02클래스
 * 	X				  O -> 04클래스
 * 	X				  X -> 01클래스
 * 
 * 	함수 정의 -> 함수를 만드는 것
 *  함수 호출 -> 만든 함수를 실행하는 것
 */

public class 함수매개변수없고반환값있는경우04 {

	public static void main(String[] args) {
		double result = sum();
		System.out.println(result);
		System.out.println("프로그램 종료!!");
	}
	//함수 정의
	public static double sum() {
		// 코드 구현
		System.out.println("void sum(int n1, int n2) 함수 호출!!");
		double pi = 3.141592;
		return pi;
	}
	
}
