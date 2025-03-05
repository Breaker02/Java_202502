package ch01.ex01;

import java.util.Random;

public class Lotto03 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1 ~ 45 랜덤하게 저장
		 * 단. 중복 불가능
		 */
		
		Random random = new Random();  //랜덤 함수 지정
		int[] lotto = new int[6];  //int(정수) 6개 생성(이름: lotto)
		//초기 지정
		boolean flag = false;
		int tmp;
		int i;
		//랜덤하게 1~45사이 값을 배열에 넣는다
		for (i = 0; i<lotto.length; i++) {  // 배열의 개수 만큼 반복
			tmp = (int)random.nextInt(45)+1;  // tmp에 랜덤값 (0 ~ 44) + 1 = 1 ~ 45 랜덤값 지정
			for(int j = 0; j < i; j++) {
				if(lotto[j] == tmp) {  // 배열 안에 있는 값이 tmp 값과 똑같을 경우
					flag = true;       // flag이 true에 됨에 따라 변경된 값일 원 상태로 되돌린다(중복 적용 X)
					break;  //강제 종료 -> 원 상태 값으로 저장 후 빠져나온다. 아래 else문으로 넘어가진다. (else -> flag = true)
				}
			}
			if (flag != true) { // flag이 true이 아닐 경우(false)
				lotto[i] = tmp;  // 배열 lotto[i]값을 tmp랑 같게 만든다.
			}
			else {  // 중복된 경우
				i--;  //i값 감소 -> i = 1 - 1 = 0(처음 초기값) = i 값이 전값으로 되돌아가져 처음 for문으로 계산이 다시 시작된다.
				flag = false;  //중복된 경우 true값으로 변환해 변경된 값을 원 상태로 되돌린다.
			}
		}

		System.out.print("이번 주 예상 로또 번호 : ");
			
			//배열 45개 칸 중 앞자리 6자리만 출력
			for (i = 0; i < 6; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		
	}

}
