package ch04.sec01;

public class ForExam02 {
	public static void main(String[] args) {
		
		/*
		 * 반복문
		 * for, while -> 조건을 만족하는 순간까지 계속 반복
		 * for -> 반복 횟수를 알 때
		 * while -> 몇번 반복하는지 모를 때
		 * do-while -> 조건을 만족하는 순간까지 계속 반복(단, 최소 1회는 보장)
		 */
		
		int sum = 0;
		
		for(int i = 1; i <=100; i++) {  // 100번 반복문
			//블럭만 수정
			//1~100까지 홀수의 합만 출력
			if(i % 2 == 1)  //if문을 활용하여 홀수인지 조건을 만든다.
			{
				sum += i;  // i가 홀수일 경우 sum에 더한다.
			}
		}
		System.out.println("sum = " + sum);
	}
}
