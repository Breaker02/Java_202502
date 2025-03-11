package ch01.ex07;

public class Account {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	private static Account ac = new Account();
	
	public Account(){}
	
	//public Account(int balance) {
	//	this.balance = balance;
	//}
	
	static Account getInstance(){
		return ac;
	}
	
	void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	int getBalance() {
		return balance;
	}
}
