package ch01.ex01;

import java.util.Random;

public class Lotto04 {

	public static void main(String[] args) {
		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1 ~ 45 랜덤하게 저장
		 * 단. 중복 불가능
		 */
		Random random = new Random();  //랜덤함수 선언
		
		int[] lotto = new int[6];  // int 배열 6칸 생성
		int temp;  // 값을 저장할 int 생성
		boolean check = false;  // 참 또는 거짓 상태 check 지정 = 기본 false(거짓) 상태 설정
		
		for(int i = 0; i < lotto.length; i++) {  // for문 배열의 갯수(6)많큼 반복되게 설정
			temp = (int)random.nextInt(45)+1;  // temp 값에 랜덤(0~44) + 1 값이 나오게 설정
			for(int j = 0; j < i; j++) {  // for문 j는 i값이 나올때까지 반복
				if(lotto[j] == temp) {  // if문 배열의 j칸 값이 temp(랜덤 수) 값이랑 같을 경우
					check = true;    // check를 참으로 설정
					break;  // 반복문을 빠져나온다(아래 if문으로 넘어간다)
				}
			}
			if(check != true) {  // check값이 true이 아닐경우(false) 즉 temp값이랑 lotto[j] 값이 다를 경우
				lotto[i] = temp; //lotoo[i] 배열 방 안에 temp 값을 넣고 반복문 반복
			}
			else {  //값이 같을 경우 (check == true -> lotto[j] == temp)
				i--; //i 값을 하나 뺀다 -> 반복문으로 0 에서 +1씩 늘어나는데 값이 같을 경우에 i값을 1로빼서 다시 전상황으로 돌아가게 만든다.
				check = false;  // check 값을 false(기본)으로 만든다.
			}
		}
		System.out.print("이번주 로또 번호: ");
		int tmp;
		for(int i = 0; i < lotto.length; i++) {// for문 배열의 갯수(6)많큼 반복되게 설정
			for(int j = 0; j < lotto.length-1-i; j++){  // for문
				if(lotto[j] > lotto[j+1]) {  // lotto[j]값이 lotto[j+1]보다 클 경우의 조건문 
					tmp = lotto[j];  // 조건문이 참일시 tmp에 lotto[j] 현재 값 저장
					lotto[j] = lotto[j+1]; //lotto[j]값을 lotto[j+1]값으로 저장
					lotto[j+1] = tmp;  //lotto[j+1]값을 tmp에 저장한다
				}  // ex) lotto[j] = 3, lotto[j+1] = 1일 경우 tmp = lotto[j] = 3, lotto[j] = lotto [j+1] = 3
				   //lotto[j] = 1, lotto[j+1] = 1, tmp = 3인상태에서 lotto[j+1] = tmp 실행하면
				   //lotto[j] = 1, lotto[j+1] = 3, tmp = 3이 되므로 정렬이 된다.(내림차순은 반대로 조건을 > 에서 < 로 변경하면 된다
			}
		}
		for (int i = 0; i < lotto.length; i++) {// for문 배열의 갯수(6)많큼 반복되게 설정
			System.out.print(lotto[i] + " "); // lotto[i]에 저장된 값 출력 
		}
	}

}
