package ch06.sec07.exam07;

public class MemberMain {

	public static void main(String[] args) {
		Member member1 = new Member("홍길동", "hong");
		
		member1.displayInfo();
		
		char c1 = 0xAC00;
		char c2 = 0xAC11;
		
		System.out.println(c1);
		System.out.println(c2);
		
		int i = 128;
		byte b = (byte)i;
		System.out.println(b);
		double f1 = 10.2;
		
		System.out.printf("abcd--%d--def--%d--%.4f--%c\n", i, b, f1, c1);
	}

}
