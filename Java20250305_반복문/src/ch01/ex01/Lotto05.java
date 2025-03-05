package ch01.ex01;

import java.util.Random;

public class Lotto05 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1 ~ 45 랜덤하게 저장
		 * 단. 중복 불가능
		 */
		
		Random random = new Random();
		int[] lotto = new int[45];
		
		int tmp;
		int i;
		//랜덤하게 1~45사이 값을 배열에 넣는다
		/*for (i = 0; i<lotto.length; i++) {
			tmp = (int)random.nextInt(45)+1;
			for(int j = 0; j < i; j++) {
				if(lotto[j] == tmp) {
					tmp = (int)random.nextInt(45)+1;  // i에 만든 랜덤 숫자와 j에 만든 랜덤숫자가 같을 경우 j를 -1해 다시 랜덤숫자가 나오게 반복, 같지 않으면 빠져나온다.
					j = -1;
				}
			}
			lotto[i] = tmp;
		}
		*/
		
		for (i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		System.out.print("이번 주 예상 로또 번호 : ");
		//45개의 숫자가 저장된 배열을 섞기 (1부터 45까지 하나씩 방을 가지고 있어서 중복이 나올 수 없음)
		for(i = 0; i < 1000; i++) {
			int index = (int)(random.nextInt(45));
			int temp = lotto[0];
			lotto[0] = lotto[index];
			lotto[index] = temp;
		}
			
			//배열 45개 칸 중 앞자리 6자리만 출력
		for (i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
	}

}
