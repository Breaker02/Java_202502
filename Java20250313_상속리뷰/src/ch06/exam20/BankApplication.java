package ch06.exam20;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		Account acc = new Account();
		
		while(flag) {
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			
			System.out.print("선택>");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				acc.createAcc();
				break;
			case 2:
				acc.listAcc();
				break;
			case 3:
				acc.deposit();
				break;
			case 4:
				acc.withDrawal();
				break;
			case 5:
				flag = false;
			default:
			}
		}
		System.out.println("프로그램 종료");
	}

}
