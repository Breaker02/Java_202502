package ch02.ex02;

public class MainStudent {
	public static void main(String[] args) {
		//1. Student 객체 생성하면서 이름(홍길동), 학년(3), 나이(20) 입력
		
		//2. printInfo() 메소드 호출
		
		//3. 이름을 이순신으로 변경
		
		//4. 변경된 이름 출력
		
		//5. 학년 5로 변경
		
		//6. 변경된 학년만 출력
		
		Student std = new Student("홍길동", 3, 20);
		
		std.printInfo();
		
		System.out.println("------------------");
		
		std.setName("이순신");
		
		String name = std.getName();
		System.out.println(name);
		
		std.setGrade(5);
		
		System.out.println(std.getGrade());
		
		
	}
}
