package ch02.ex02;

public class Student {
	private String name; //이름
	private int grade; // 학년
	private int age; //나이
	
	
	public Student(String n, int g, int a) {
		name = n;
		grade = g;
		age = a;
	}

	
	void setName(String n) {
		name = n;
	}
	void setGrade(int g) {
		grade = g;
	}
	
	String getName() {
		return name;
	}
	
	int getGrade() {
		return grade;
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("나이 : " + age);
	}



}
