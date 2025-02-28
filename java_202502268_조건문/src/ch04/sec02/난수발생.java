package ch04.sec02;

public class 난수발생 {

	public static void main(String[] args) {
		System.out.println(Math.random());  // 0~1 사이의 난수
		
		System.out.println((int)(Math.random()*6));  // 0~5 정수
		System.out.println((int)(Math.random()*6)+1);  // 1~6 정수
		
		System.out.println(Math.PI);  // 파이
		System.out.println(Math.abs(-1)); //절대값
		System.out.println(Math.sqrt(4)); //루트
		System.out.println(Math.sqrt(9));
		
		System.out.println(Math.floor(12.91));  // 소수점 이하 절삭
		System.out.println(Math.max(10, 4)); // 최대값
		System.out.println(Math.pow(3, 3)); //제곱근
	}

}
