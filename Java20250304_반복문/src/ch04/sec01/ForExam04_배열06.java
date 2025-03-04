package ch04.sec01;

import java.util.Scanner;

public class ForExam04_배열06 {

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {  // 5*5
			for(int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------"); 
		for(int i = 0; i < 5; i++) {  //1*5 1부터 5까지 별 출력
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		for(int i = 0; i < 5; i++) { //5*1 5부터 1까지 별 출력
			for(int j = 5; j > i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		for(int i = 1; i < 5; i++) {
			for(int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		for(int i = 1; i < 5; i++) {
			for(int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 3; i > 0; i--) {
			for(int j = 5-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
