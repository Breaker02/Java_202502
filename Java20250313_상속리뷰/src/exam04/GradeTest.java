package exam04;

import java.util.Scanner;

public class GradeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 입력된 값 저장
		
		System.out.print("데이터 갯수>>");
		int count = sc.nextInt();
		
		//배열 생성
		int[] nArr = new int[count];
		
		//입력한 배열숫자(n)만큼 for문 반복
		for(int i = 0; i < nArr.length; i++) {
			System.out.print("정수 입력>>");
			nArr[i] = sc.nextInt();  // 배열에 입력된 값 저장
		}
		//배열에 저장된 점수를 나열한다.
		System.out.print("점수: ");
		for(int i = 0; i < nArr.length; i++) {
			System.out.print(nArr[i] + ", ");
		}
		
		GradeExpr grade = new GradeExpr(nArr);
		
		System.out.println("총점: " + grade.getTotal());
        //System.out.println("평균: " + grade.getAverage());
		System.out.printf("평균: %.2f\n", grade.getAverage());
        System.out.println("최고 점수: " + grade.getGoodScore());
        System.out.println("최저 점수: " + grade.getBadScore());
	}
}
