package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
		/*
		 * 키보드를 통해서 국어점수, 영어점수를 입력 받는다.
		 * 국어점수, 영어점수 둘다 70이상이면 합격 아니면 불합격
		 * 70 이상 >=, 70 초과 >, 70 이하 <=, 70 미만 <
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 입력:");
		int korScore = sc.nextInt();
		
		System.out.print("영어점수 입력:");
		int engScore = sc.nextInt();
		
		sc.nextLine();  // 버퍼 enter키 비우기, 굳이 안해도 됨
		
		//System.out.print(korScore + "," + engScore);
		
		//(조건)? 참:거짓
		String result = ((korScore & engScore) >= 70)? "합격":"불합격";
		System.out.println("결과:" + result);
		
		//if를 사용한 조건/결과 
		/*if ((korScore & engScore) >= 70) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		*/
	}
}
