package ch01.ex06;

public class MainPerson {

	public static void main(String[] args) {
		Person p1 = new Person("설악산", 101);
		Person p2 = new Person("지리산", 102);
		
		//person = person2;
		
		
		p1.run();
		p2.run();
		
		System.out.println("전체 학생 수: " + Person.count);
		
	}

}
