package ch01.ex05;

import java.util.Scanner;

public class 연습문제5장9번 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int number = 0;
		int[] scores = null;
		
		while(flag) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");
			
			number = Integer.parseInt(sc.nextLine());
			if(number == 1) {
				System.out.print("학생수>");
				int student = Integer.parseInt(sc.nextLine());
				scores = new int[student];
			} else if(number == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d]>", i);
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			} else if(number == 3) {
				for(int i = 0; i < scores.length; i++) {
					//System.out.printf("Scores[%d]>%d\n", i, scores[i]);
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
			} else if(number == 4) {
				int sum = 0;
				int max = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if( max < scores[i]) {
						max = scores[i];
					}
				}
				System.out.printf("최고 점수: %d\n", max);
				double avg = sum / (double)scores.length;
				System.out.printf("평균 점수: %.1f\n", avg);
				break;
			} else if(number == 5) {
				flag = false;
			}
		} // end while
		System.out.println("프로그램 종료");
	}
}
