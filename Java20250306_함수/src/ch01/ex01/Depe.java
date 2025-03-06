package ch01.ex01;

public class Depe {
	public static void main(String[] args) {
		int[] number = new int[10];
		
	
		for(int i = 0; i<10; i++) {
			number[i] = (i+1)*10;
		}
		
		for(int i = 0; i<10; i++) {
			System.out.print(number[i] + " ");
		}
		System.out.println();
		int resultA = even(number);
		System.out.println("짝수:"+resultA);
		
		int resultB = odd(number);
		System.out.println("홀수:"+resultB);
		
	}
	public static int even(int[] number) {
		int even = 0;
		for (int i = 0; i < number.length; i++) {
			int num = number[i] / 10;
			if(num % 2 == 0) {
				even += number[i];
			}
		}
		return even;
	}
	public static int odd(int[] number) {
		int odd = 0;
		for (int i = 0; i < number.length; i++) {
			if((number[i] / 10) % 2 == 1) {
				odd += number[i];
			}
		}
		return odd;
	}
}
