package ch02.sec1;

public class StringExample {
	public static void main(String[] args) {
		
		int num = 100;
		
		String name = "홍길동";
		
		System.out.println(name);
		System.out.println(num);
		
		String job = "프로그래머";
		
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다");
	
		System.out.print("\n");
		
		String name2 = "나는 자바를 배웁니다.";
		System.out.println(name2);
		
		System.out.print("--------");
		System.out.print("++++++++");
		System.out.println("********");  // 다음 줄 부터 띄어쓰기
		
	}
}
