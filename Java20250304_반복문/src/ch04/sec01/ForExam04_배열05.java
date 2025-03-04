package ch04.sec01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {
		//7명 학생 점수를 입력 받아서, 총점 평균을 구하기
		
		Scanner sc = new Scanner(System.in);
		//예시 >> int num = 0;
		int[] student = new int[] {10,-3,-700,1,2,9,3};
		int sum = 0;
		int i;
		double avg = 0;

		for(i = 0; i < 7; i++) {
			sum += student[i];
		}
		avg = sum / 7.0;
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
		System.out.println("7번째 값 출력 : " + student[6]);
		
		System.out.println("-----------------------------------------------");
		//코드
		
		int max = student[0];
		int min = student[0];
		
		for(i = 0; i < 7; i++) {
			if(student[i] > max) {
				max = student[i];
			}
			if(student[i] < min) {
				min = student[i];
			}
		}
		
		System.out.println("최대값 : " + max);  // 99
		System.out.println("최소값 : " + min);  // 54
		System.out.println("-----------------------------------------------");
		/*
		 * {10, -3, -700, 1, 2, 9, 3}
		 * 키보드 : 1 입력하면, 출력 : 1값은 4번째 위치입니다.
		 * 키보드 : -3 입력하면, 출력 : -3값은 2번째 위치입니다.
		 * 
		 * 반복문, 조건문 이용
		 */
		
		int index = -1;
		System.out.print("찾을 숫자 입력:");
		int num = sc.nextInt();
		
		for(i = 0; i < 7; i++) {
			if(num == student[i])
			{
				index = i;
			}
		}
		if(index != 0) {
			System.out.printf("%d값은 %d번째 위치입니다.", num, index+1);
		}
		else {
			System.out.printf("%d값은 찾을 수 없습니다.", num);
		}
		
		System.out.println("-----------------------------------------------");
		
		/*
		 * {10, -3, -700, 1, 2, 9, 3}
		 * 
		 * 정렬(sort)해서 출력하기{-700. -3. 1. 2, 3, 9, 10}
		 */
		
		
	}

}
