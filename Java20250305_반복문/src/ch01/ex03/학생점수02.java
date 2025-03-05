package ch01.ex03;

import java.util.Scanner;

public class 학생점수02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int student = 0;
		int[] score = new int[0];
		int i;
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		while(flag) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("선택>");
				student = sc.nextInt();
				score = new int[student];
			}
			else if(num == 2) {
				for(i = 0; i < score.length; i++) {
					System.out.printf("Score[%d]>", score[i]);
					score[i] = sc.nextInt();
				}
			}
			else if(num == 3) {
				
			}
		}
		System.out.println("프로그램 종료");
	}

}
