package ch02.sec1;

public class StringConcatExample {
	public static void main(String[] args) {
		//숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1 : " + result1);
		
		String result2 = 10 + 2 + "8";
		System.out.println("result2 : " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("result3 : " + result3);
		//1차 => "10" + "2" = "102"
		//2차 => "102" + "8" = "1028"
		
		String result4 = "10" + 2 + 8;
		System.out.println("result4 : " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("result5 : " + result5);
		//1차 => (2 + 8) = "10"
		//2차 => "10" + "10" = "1010"
		
		String str = "10";
		
	}
}
