package ch04.sec02;

public class IfExample5 {

	public static void main(String[] args) {
		/*
		 * 학점(grade) 계산
		 * 90 : A
		 * 80 : B
		 * 70 : C
		 * 60 : D
		 * 60 미만 : F
		 */
		
		int grade = 74;
		if (grade >= 90) {
			System.out.println("학점 A");
		}
		else if (grade >= 80) {
			System.out.println("학점 B");
		}
		else if (grade >= 70) {
			System.out.println("학점 C");
		}
		else if (grade >= 60) {
			System.out.println("학점 D");
		}
		else{
			System.out.println("학점 F");
		}
		System.out.println("종료");
	}
}
