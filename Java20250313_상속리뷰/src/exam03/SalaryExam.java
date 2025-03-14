package exam03;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력>> ");
		int month = sc.nextInt();
		
		System.out.print("등급(1~4)>> ");
		int grade = sc.nextInt();
		
		int bonus = 0;
		SalaryExpr expr = null;
		
//	        if (month % 2 == 0) { // 짝수 달이면 보너스 100 추가
//	        	expr = new SalaryExpr(100);
//	        } else { // 홀수 달이면 기본 보너스(0)
//	        	expr = new SalaryExpr();
//	        }

		expr = (month % 2 == 0) ? new SalaryExpr(100) : new SalaryExpr(0);	        bonus = expr.getSalary(grade);
	       
	        System.out.println(
	        		month + "월" + grade + "의 월급은 " + bonus + " 입니다."
	        		);
	        
	        
		
	}

}
