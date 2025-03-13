package ex03;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();
	
		method(u1);
		method(s1);
		method(p1);
	}
	//p가 참조하고있는 대상은 Person 객체 이거나 Person에 상속한 객체이다
	static void method(Person p) {
		//p 참조하고 있는 객체가 University인가?
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p;
			u.sleep();
			u.study();
			u.registerCourse();
		//p를 참조하고 있는 객체가 Student인가
		}else if(p instanceof Student) {
			Student s = (Student)p;
			s.sleep();
			s.study();
		//p를 참조하고 있는 객체가 Person(나머지)인가
		}else {
			p.sleep();
		}
		System.out.println("------------------------------------------");
	}

}
