package ch04.sec01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {
		/*
		 * 키보드 숫자 입력 받는다.
		 * ex) 5 --> 1 ~ 5 누적 합 15
		 *     10 --> 1 ~ 10 누적 합 55
		 *     100 --> 1 ~ 100 누적 합 550
		 */
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자 입력>>");
		int number = sc.nextInt();
		
		for(int i = 1; i <=number; i++) {  // 100번 반복문
			//블럭만 수정
			//1~100까지 홀수의 합만 출력
			if(i % 2 == 1)  //if문을 활용하여 홀수인지 조건을 만든다.
			{
				sum += i;  // i가 홀수일 경우 sum에 더한다.
			}
		}
		System.out.println(sum);
		
		sum = 0;
		
		for(int i = 1; i <= number; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
