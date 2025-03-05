package ch01.ex01;

import java.util.Random;

public class 정렬02 {

	public static void main(String[] args) {

		//seed값을 넣어주면 랜덤숫자가 일정하게 나온다.
		//int seed = 100;
		//Random random = new Random(seed);
		//seed값을 넣지 않으면 랜덤하게 숫자가 추출된다.
		Random random = new Random();
		
		int[] numArr = new int[10];
		int tmp;
		
		//랜덤하게 1~100사이 값을 배열에 넣는다
		for (int i = 0; i<numArr.length; i++) {
			//tmp = (int)(Math.random()*100)+1;
			tmp = (int)random.nextInt(100);
			numArr[i] = tmp;
		}
		//랜덤하게 배열 저장된 값 출력
		for (int i = 0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		//최대값, 최소값 출력
		//코드 구현
		int max, min;
		max = min = numArr[0];
		for (int i = 1; i<numArr.length; i++) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
			if(min > numArr[i]) {
				min = numArr[i];
			}
		}
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("최대값: " + max + " 최소값: " + min);
		
		System.out.println("-----------------------------");
		//총점, 평균
		int sum = 0;
		double avg = 0;
		int i;
		
		for (i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		avg = sum / (double)numArr.length;
		System.out.printf("총점: %d / 평균: %.2f\n", sum, avg);
		
		//정렬~(버블정렬)
		int temp;
		for(i = 0; i < numArr.length; i++) {
			for(int j = 0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					
				}
			}
		}
		for(i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}

}







