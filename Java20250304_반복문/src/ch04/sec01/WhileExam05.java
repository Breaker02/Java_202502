package ch04.sec01;

import java.util.Scanner;

public class WhileExam05 {

	public static void main(String[] args) {
		/*int count = 0;
		for(; ;count++) {
			if (count>100) {
				break;
			}
			System.out.println(count);
		}
		*/
		int cnt = 0;
		while(true) {
			cnt++;
			if(cnt>100) break; 
			System.out.println(cnt);
		}
	}
}
