package ch04.sec02;

import java.util.Random;

public class 난수발생02 {

	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println(random.nextInt(6)+1);
		
		System.out.println(random.nextDouble(10));
	}

}
