package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제3 {

	public static void main(String[] args) {
		try (/*
				 * 키보드를 통해서 국어점수, 영어점수를 입력 받는다.
				 * 국어점수 80 이상이면 상, 60 이상이면 중 59 이하이면 하
				 */
		Scanner sc = new Scanner(System.in)) {
			System.out.print("국어점수 입력:");
			int korScore = sc.nextInt();
			
			sc.nextLine();  // 버퍼 enter키 비우기, 굳이 안해도 됨
			
			//System.out.print(korScore + "," + engScore);
			
			//(조건)? 참:거짓(조건)? 참:거짓
			String result = (korScore >= 80)? "상" : (korScore >= 60)? "중" : "하";
			System.out.println("결과:" + result);
		}
		//if를 사용한 조건/결과 
		/*if (korScore >= 80) {
			System.out.println("상");
		}
		else if (korScore >= 60){
			System.out.println("중");
		}
		else {
			System.out.println("하");
		}
		*/
	}
}
