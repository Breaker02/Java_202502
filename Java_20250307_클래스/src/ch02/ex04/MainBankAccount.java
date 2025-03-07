package ch02.ex04;


public class MainBankAccount {

	public static void main(String[] args) {

		BankAccount ba = new BankAccount("최순정", 10000);
		
		//double dep = ba.deposit();
		ba.deposit(10000);
		ba.withdraw(10000000);
		ba.withdraw(2000);
		
		System.out.println(ba.getBalance());
	}

}
