<<<<<<< HEAD
package ch02.sec1;

public class TextBlockExample {
	public static void main(String[] args) {
		String str1 = "" + 
				"{\n" + 
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\",\n" +
				"}";
		
		String str2 = """
				{
					"id":"winter"
					"name":"눈송이"
				}
				""";
		
		System.out.println(str1);
		System.out.println("-----------------------------------");
		System.out.println(str2);
		System.out.println("-----------------------------------");
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str);
	}
}
=======
package ch02.sec1;

public class TextBlockExample {
	public static void main(String[] args) {
		String str1 = "" + 
				"{\n" + 
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\",\n" +
				"}";
		
		String str2 = """
				{
					"id":"winter"
					"name":"눈송이"
				}
				""";
		
		System.out.println(str1);
		System.out.println("-----------------------------------");
		System.out.println(str2);
		System.out.println("-----------------------------------");
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str);
	}
}
>>>>>>> 64f51575e85455c2eca163757bb1ebe3702fd364
