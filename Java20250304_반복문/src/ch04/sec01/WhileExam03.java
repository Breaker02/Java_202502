package ch04.sec01;

import java.util.Scanner;

public class WhileExam03 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("숫자 입력>>");
		int number = sc.nextInt();
		
		for(int i = 1; i <=number; i++) {  // 100번 반복문
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
		*/
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수입력>>");
		int number = sc.nextInt();
		
		int i = 1;
		while(i <= number) {
			if(i%2 == 1) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
