package ch04.sec02;

/*
 * 사용자가 월을 입력하면 해당 월이 어느 계절에 해당하는지를 출력하는 프로그램을 작성하세요.
 * 계절은 다음과 같이 결정됩니다.
 * 
 * 12월, 1월, 2월: 겨울
 * 3월, 4월, 5월: 봄
 * 6월 7월 8월: 여름
 * 9월 10월, 11월: 가을
 */

import java.util.Scanner;

public class 월계산프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //입력된 값 저장
		String season = "";
		
		System.out.print("월을 입력하세요:");
		int month = sc.nextInt();  // Int 값으로 저장
		
		if(month == 12 || month <= 2) {  // month == 12 || month == 1 || month == 2
			season = "겨울";
		}
		else if(month <=5) {// month == 3 || month == 4 || month == 5 or month >= 3 && month <= 5
			season = "봄";
		}
		else if(month <=8) {// month == 6 || month == 7 || month == 8 or month >= 6 && month <= 8
			season = "여름";
		}
		else if(month <=11) {// month == 9 || month == 10 || month == 11 or month >= 9 && month <= 11
			season = "가을";
		}
		//System.out.println("입력한 " + month + "월의 계절은" + season + "입니다.");
		System.out.printf("입력한 %d월의 계절은 %s입니다.\n", month, season);
		System.out.println("종료");
	}
	
}
