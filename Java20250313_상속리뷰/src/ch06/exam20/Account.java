package ch06.exam20;

import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);
	
	String[] account = new String[100];
	
	String accnum;
	String accname;
	int money;
	
	Account() {}
	
	public Account(String accnum, String accname, int money) {
		this.accnum = accnum;
		this.accname = accname;
		this.money = money;
	}
	
	void createAcc() {
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		
		System.out.print("계좌번호: ");
		String accnum = sc.nextLine();
		
		System.out.print("계좌주: ");
		String accname = sc.nextLine();
		
		System.out.print("초기입금액: ");
		int firstmoney = sc.nextInt();
		
		firstmoney = money;
	}
	
	void listAcc() {
		System.out.println("---------------");
		System.out.println("계좌목록");
		System.out.println("---------------");
		for(int i = 0; i <account.length; i++) {
			System.out.println(accnum + " " + accname + " " + money);
		}
	}
	
	void deposit() {
		System.out.print("계좌번호: ");
		accnum = sc.nextLine();
		
		for(int i = 0; i < accnum.length(); i++) {
			if(accnum == account[i]) {
				System.out.println("예금액: ");
				money = sc.nextInt();
				money += money;
			}
		}
	}
	
	void withDrawal() {
		System.out.print("계좌번호: ");
		accnum = sc.nextLine();
		
		for(int i = 0; i < accnum.length(); i++) {
			if(accnum == account[i]) {
				System.out.println("출금액: ");
				money = sc.nextInt();
				money -= money;
			}
		}
	}
	
}
