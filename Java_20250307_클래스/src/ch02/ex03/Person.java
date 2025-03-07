package ch02.ex03;

public class Person {
	private String name; //이름
	private int age; //나이
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	void introduce() {
		System.out.println("제 이름은 [" + name + "]이고, [" + age + "]살입니다.");
	}
}
