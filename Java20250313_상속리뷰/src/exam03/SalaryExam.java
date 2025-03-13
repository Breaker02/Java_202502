package exam03;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 정보: ");
		int month = sc.nextInt();
		
		System.out.print("등급: ");
		int grade = sc.nextInt();
		
		SalaryExpr salary;
	        if (month % 2 == 0) { // 짝수 달이면 보너스 100 추가
	            salary = new SalaryExpr(100);
	        } else { // 홀수 달이면 기본 보너스(0)
	            salary = new SalaryExpr();
	        }

	        // 월급 계산 및 출력
	        int totalSalary = salary.getSalary(grade);
	        if (totalSalary != -1) { // 유효한 등급인 경우 출력
	            System.out.println(month + "월 " + grade + "등급의 월급은 " + totalSalary + "입니다.");
	        }
		
		
	}

}
