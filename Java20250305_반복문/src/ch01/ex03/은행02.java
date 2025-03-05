package ch01.ex03;

import java.util.Scanner;

public class 은행02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		boolean flag = false;
		
		while(flag != true) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int num = Integer.parseInt(sc.nextLine()); // 문자열을 정수(int)로 변환하는 메서드 -> 123 이라는 문자열을 숫자 123으로 변환 후 저장
			
			switch(num) {
			case 1:
				System.out.print("예금액>");
				money += Integer.parseInt(sc.nextLine());//sc.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				money -= Integer.parseInt(sc.nextLine());//sc.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + money);
				break;
			case 4:
				flag = true;
				break;
			default:
				System.out.print("잘못 입력하셨습니다. 다시 입력해 주세요");
				break;
			}
			// sc.nextLine();  // 버퍼 비우기
			if(flag == true) break;
		}
		System.out.println("프로그램 종료");
	}

}
