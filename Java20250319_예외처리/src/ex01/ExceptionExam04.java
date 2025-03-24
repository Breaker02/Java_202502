package ex01;

import java.util.Scanner;

public class ExceptionExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력>");
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		System.out.println("합 : : " + (num1+num2));
		System.out.println("차 : : " + (num1-num2));
		System.out.println("곱 : : " + (num1*num2));
		
		
		int[] arr = new int [10];
		String str = "korea";
		try {
			System.out.println("나누기 : : " + (num1/num2));
			arr[5] = 10;
			System.out.println(str.length());
		}catch(Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
//		catch(ArithmeticException e) {
//			System.out.println("0으로 나눌때 발생");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("배열공간 부족");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}catch(NullPointerException e){
//			System.out.println("참조값이 없다");
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}

		System.out.println("프로그램 종료!");
		
		
	}

}
