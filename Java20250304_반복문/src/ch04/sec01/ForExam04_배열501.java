package ch04.sec01;

import java.util.Scanner;

public class ForExam04_배열501 {

	public static void main(String[] args) {
		//7명 학생 점수를 입력 받아서, 총점 평균을 구하기
		// 최대값, 최소값 구하기
		/*
		 * {10, -3, -700, 1, 2, 9, 3}
		 * 키보드 : 1 입력하면, 출력 : 1값은 4번째 위치입니다.
		 * 키보드 : -3 입력하면, 출력 : -3값은 2번째 위치입니다.
		 * 
		 * 반복문, 조건문 이용
		 */
		Scanner sc = new Scanner(System.in);
		//예시 >> int num = 0;
		int [] student = new int[7];
		//int [] numA = new int[] {10, -3, -700, 1, 3, 9, 7};
		
		int sum = 0;
		
		for (int i = 0; i < 7; i++) {
			System.out.printf("%d번 학생 점수 입력>>", i+1);
			student[i] = sc.nextInt();
			sum += student[i];
		}
		double avg = sum/7.0;
		System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
		System.out.println("----------------------------------------");
		
		int max = student[0];
		int min = student[0];
		
		for (int i = 0; i < 7; i++) {
			if(max < student[i]) {
				max = student[i];
			}
			if(min > student[i]) {
				min = student[i];
			}
		}
		
		//System.out.println("최대값 : " + max);  
		//System.out.println("최소값 : " + min);  // 54
		System.out.printf("최대값: %d, 최소값: %d\n",max, min);
		System.out.println("----------------------------------------");
		System.out.print("찾을 숫자 입력:");
		int find = sc.nextInt();
		
		int index = -1;
		
		for (int i = 0; i < 7; i++) {
			if(find == student[i]) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.printf("%d 값은 %d번째 위치입니다.", find, index+1);
		} else {
			System.out.printf("%d의 값은 찾을수 없습니다.", find);
		}
	}

}
