package ex01;

import java.util.Scanner;

public class ExceptionExam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력>");
		int num1 = sc.nextInt();
		
		int num2 = 0;
		
		while (true) {
			num2 = sc.nextInt();
		
			if(num2 == 0) {
				System.out.println("0은 입력 불가");
				continue;
			}
			break;
		}
		
		System.out.println("합 : : " + (num1+num2));
		System.out.println("차 : : " + (num1-num2));
		System.out.println("곱 : : " + (num1*num2));
		System.out.println("나누기 : : " + (num1/num2));
		
		System.out.println("프로그램 종료!");
		
		
	}

}
