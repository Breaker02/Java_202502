package ex04;

public class MainPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Student s1 = new Student();
		UniversityStudent u1 = new UniversityStudent();
	
		method(u1);
		method(s1);
		method(p1);
	}
	static void method(Person p) {
		if(p instanceof UniversityStudent) {
			UniversityStudent u = (UniversityStudent)p;
			((UniversityStudent)p).sleep();
			((UniversityStudent)p).study();
			((UniversityStudent)p).registerCourse();
		}else if(p instanceof Student) {
			Student s = (Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("------------------------------------------");
	}

}

