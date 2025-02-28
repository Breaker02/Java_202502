package ch04.sec02;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 조건문
		 * 1. if
		 * 2. if - else
		 * 3. if - else if - else
		 * 
		 * switch 문
		 * 
		 */
		int kor = 60;
		//int eng = 80;
		
		if(kor >= 70) {
			System.out.println("합격");
			System.out.println("합격");
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			System.out.println("불합격");
			System.out.println("불합격");
			System.out.println("불합격");
		}
		//if(eng >= 70) {
		//	System.out.println("합격");
		//}
		System.out.println("종료");
	}

}
