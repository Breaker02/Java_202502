package ch01.ex03;

import java.util.Scanner;

public class 은행03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		//boolean flag = false;
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int num = Integer.parseInt(sc.nextLine()); // 문자열을 정수(int)로 변환하는 메서드 -> 123 이라는 문자열을 숫자 123으로 변환 후 저장
			
			if (num == 1) {
				System.out.println("예금액>");
				money += Integer.parseInt(sc.nextLine());
			} 
			else if (num == 2) {
				System.out.println("출금액>");
				money -= Integer.parseInt(sc.nextLine());
			} 
			else if (num == 3) {
				System.out.print("잔고>");
				System.out.println(money);
			} 
			else if (num == 4) {
				break;
			} 
		}
		System.out.println("프로그램 종료");
	}

}
