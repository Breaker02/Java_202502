package ch01.ex03;

import java.util.Scanner;

public class 학생점수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int student = 0;
		int[] score = null;
		int max = 0;
		int sum = 0;
		double avg = 0;
		
		while(flag) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("학생수>");
				student = sc.nextInt();
				score = new int[student];
				break;
			case 2:
				for(int i = 0; i < score.length; i++) {
					System.out.printf("Scores[%d]>", i);
					score[i] = sc.nextInt();
				}
				break;
			case 3:
				for(int i = 0; i < score.length; i++) {
					System.out.printf("Scores[%d]>%d\n", i, score[i]);
				}
				break;
			case 4:
				for(int i = 0; i < score.length; i++) {
					sum += score[i];
					if(max < score[i]) {
						max = score[i];
					}
				}
				System.out.printf("최고 점수: %d\n", max);
				avg = sum / (double)score.length;
				System.out.printf("평균 점수: %.1f\n", avg);
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			sc.nextLine();
		}
		System.out.println("프로그램 종료");
	}

}
