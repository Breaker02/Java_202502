package ch01.ex02;

public class DoWhile01 {

	public static void main(String[] args) {
		
		int sum2 = 0;
		int i = 1;
		while(i <=100) {
			sum2 += i;
			i++;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		int j = 0;
		do {  // 문장을 최소한 한번 더 실행
			j++;
			sum3 += j;
		}while(j<=100); // 후에 while 반복문 실행
		System.out.println(sum3);
	}

}
