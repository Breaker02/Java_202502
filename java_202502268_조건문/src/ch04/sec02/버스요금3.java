package ch04.sec02;

import java.util.Scanner;

public class 버스요금3 {
	public static void main(String[] args) {
		/*
		 * 버스요금 계산 프로그램
		 * 기본 요금 : 2000
		 * 1~5세: 무료
		 * 6~12세 : 50% 할인
		 * 13~18세: 25% 할인
		 * 65세 이상 무료
		 */
		Scanner sc = new Scanner(System.in);  //입력된 값 저장
		int age = 0;
		int fee = 2000; //버스 요금
		double rate = 0; //할인율
		
		System.out.print("나이를 입력해 주세요:");
		age = sc.nextInt();  // Int 값으로 저장
		
		if(age >= 65 || age <= 5) {
			rate = 0;
		}
		else if(age >= 6 && age <=12) {
			rate = 0.5;
		}
		else if(age >= 13 && age <=18) {
			rate = 0.75;
		}
		else if (age >= 19 && age <=64){
			rate = 1;
		}
		
		fee = (int) (fee * rate);
		System.out.println("버스 요금 : " + fee + "원 입니다.");
		
		System.out.println("종료");
	}
}
