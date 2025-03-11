package ch01.ex07;

public class MainAccount {

	public static void main(String[] args) {
		Account ac = Account.getInstance();  // static Account을 붙여도 빨간줄 들어온 이유 => 
		 // static Account을 붙여도 빨간줄 들어온 이유 => 
		// 정적변수에 값이 없어서?
	
		ac.setBalance(10000);
		
		Account ac2 = Account.getInstance();
		System.out.println(ac2.getBalance());
	}

}
