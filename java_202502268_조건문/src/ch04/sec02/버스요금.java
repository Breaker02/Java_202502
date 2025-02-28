package ch04.sec02;

import java.util.Scanner;

public class 버스요금 {
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
		System.out.print("나이를 입력해 주세요:");
		int age = sc.nextInt();  // Int 값으로 저장
		double busPay = 2000; // 버스 요금 기본값
		
		sc.nextLine();
		if(age >= 6 & age <= 12) {
			busPay =  (int) (busPay * 0.5);
			System.out.println("6~12세는 50% 할인입니다.");  // * 0.5 -> 50%(50%할인),  busPay / 5의 값과 동일, 1000원
			System.out.println("버스요금:" + busPay + "원");
		}
		else if(age >= 13 & age <= 18) {
			busPay = (int) (busPay * 0.75);  // * 0.75 -> 75%(25%할인),  busPay / 2.5의 값과 동일, 1500원
			System.out.println("13~18세는 25% 할인입니다.");
			System.out.println("버스요금:" + busPay + "원");
		}
		else if(age <= 5 | age >= 65) {
			busPay = 0; // 1~5세, 65세 이상은 무료이므로 busPay 값을 0(무료)원으로 지정
			System.out.println("1~5세, 65세 이상은 무료입니다.");
			System.out.println("버스요금:" + busPay + "원");
		}
		else {
			System.out.println("기본요금 나이입니다.");
			System.out.println("버스요금:" + busPay + "원");
		}
	}
}
