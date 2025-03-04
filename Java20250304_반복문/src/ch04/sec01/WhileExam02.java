package ch04.sec01;

public class WhileExam02 {

	public static void main(String[] args) {
		/*int sum = 0;
		
		for(int i = 1; i <=100; i++) {  // 100번 반복문
			//블럭만 수정
			//1~100까지 홀수의 합만 출력
			if(i % 2 == 1)  //if문을 활용하여 홀수인지 조건을 만든다.
			{
				sum += i;  // i가 홀수일 경우 sum에 더한다.
			}
		}
		System.out.println("sum = " + sum);
		*/
		
		int sum = 0;
		int i = 1;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
