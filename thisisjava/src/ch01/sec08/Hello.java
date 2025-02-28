package ch01.sec08; // 패키지명

// --> 한줄 주석
// 주석이란 설명하는 문장
// 첫번째 프로그램
// Hello, Java 문장 출력

/*  --> 다중형 주석
    주석이란 설명하는 문장
    첫번째 프로그램
    Hello, Java 문장 출력
 */

public class Hello {  // 클래스 파일
	public static void main(String[] args) {  // 메인
		int a = 10; // a 값을 10으로 지정
		int b = 20; // b 값을 20으로 지정
		int c = 30; // c 값을 30으로 지정
		
		int d = a + b + c; // d 값을 a,b,c 의 합으로 지정
		
		System.out.println("총합 : " + d);  // 총합 값 출력
	}
}
