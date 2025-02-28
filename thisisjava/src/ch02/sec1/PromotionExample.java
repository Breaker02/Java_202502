package ch02.sec1;

public class PromotionExample {
	public static void main(String[] args) {
		// double > float > long > int > short > byte
		
		double d1 = 10.2;
		
		int i1 = 10;
		
		//d1 = i1;
		d1 = (double)i1;
		
		short s1 = 10;
		
		i1 = (int)s1;
		
		s1 = (short) i1;
		
		int a = 40000;
		short b = (short)a;
		
		System.out.println(b);
		
		int a1 = 10;
		String b1 = "korea";
		System.out.println(a1+b1);
		
		String s11= "9";
		int num1 = 9;
		System.out.println(s11);
		System.out.println(num1);
		System.out.println(s11+num1);
		
		System.out.println( 10/3.0 );
		
		int k = 10;
		int j = 3;
		System.out.println((double)k/j);
		
		
	}
}
