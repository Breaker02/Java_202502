package ch01.ex03;

import java.util.Scanner;

public class 은행 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean choice = true;
		int num = 0;
		int money = 0;
		
		while(choice) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3. 잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택>");
			num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("예금액>");
				money += sc.nextInt();
				if(money < 0) {
					System.out.println("- 값은 입력이 불가합니다.");
					continue;
				}
			}
			else if(num == 2) {
				System.out.print("출금액>");
				money = sc.nextInt();
				if(money < 0) {
					System.out.println("- 값은 입력이 불가합니다.");
					continue;
				}
				if(money > money) {
					System.out.println("잔고의 값보다 높게 입력할 수 없습니다.");
					continue;
				}
			}
			else if(num == 3 ) {
				System.out.println("잔고>"+money);;
			}
			else if(num == 4) {
				choice = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다 다시 입력해 주세요.");
			}
			 sc.nextLine();  // 버퍼 비우기
		}
		System.out.println("프로그램 종료");
	}

}
