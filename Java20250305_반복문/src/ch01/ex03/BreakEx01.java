package ch01.ex03;

public class BreakEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		// 1~100까지 누적하다가, sum값이 2000 이상이 되는 순간 i, sum값 출력
		for (i = 0; i <= 100; i++) {
			sum += i;
			if(sum >= 2000) {
				break;
			}
		}
		System.out.println(sum);
		System.out.println(i);
	}

}
