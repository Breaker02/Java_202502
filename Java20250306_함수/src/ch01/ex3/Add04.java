package ch01.ex3;

import java.util.Scanner;

/*
 * 2개 값을 입력받아서, 더하는 기능 수해
 * 매개변수 O , 반환 O
 */

public class Add04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = sc;
		
		int a = 100;
		int b = 100;
		
		
		
		System.out.println("main함수 시작");
		
		int numA = (int)(Math.random()*100)+1;
		int numB = (int)(Math.random()*100)+1;
		
		int result = add(numA, numB);
		System.out.println(result);
		
		System.out.println("프로그램 종료!");
	}

	public static int add(int numA, int numB) {
		
		System.out.println("add() 시작");
		System.out.println(numA + " + " + numB + " = " + (numA+numB));
		
		return numA+numB;
		
		//int sum = numA + numB
		//return sum
	}
}
