<<<<<<< HEAD
package ch02.sec1;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
	
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str2: " + str3);
		
		String str = "10";
		int num = Integer.parseInt(str) + 1;
		System.out.println(num);
	}
}
=======
package ch02.sec1;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
	
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
	
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str2: " + str3);
		
		String str = "10";
		int num = Integer.parseInt(str) + 1;
		System.out.println(num);
	}
}
>>>>>>> 64f51575e85455c2eca163757bb1ebe3702fd364
