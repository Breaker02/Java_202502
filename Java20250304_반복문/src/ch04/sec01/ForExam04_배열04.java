package ch04.sec01;

import java.util.Scanner;

public class ForExam04_배열04 {

	public static void main(String[] args) {
		//7명 학생 점수를 입력 받아서, 총점 평균을 구하기
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i;
		int[] num = new int[7];
		
		for(i = 0; i < 7; i++) {
			System.out.printf("%d번 학생 점수 >>", i+1);
			num[i] = sc.nextInt();
			sum += num[i];
		}
		double avg = sum / 7.0;
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
	}

}
