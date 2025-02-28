package ch01.ex12;

import java.util.Scanner;

public class NameAgeExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력:");
		int age = sc.nextInt();
		System.out.println("나이는 " + age);
		
		sc.nextLine(); //버퍼 클리어
		
		System.out.println("이름 입력:");
		String name = sc.nextLine();
		System.out.println("이름은 " + name );
		
	}

}
