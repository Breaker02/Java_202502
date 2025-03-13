package ex03;

public class UniversityStudent extends Student {
	private String major;  //전공
	private boolean isIntens;  //인턴여부
	private int scholarship;  //장학금
	
	UniversityStudent() {}
	
	UniversityStudent(String name, int age, String schoolName, int grade, String major) {
		super(name, age, schoolName, grade);
		this.major = major;
	}
	
	void registerCourse() {} // 수강신청
	
	@Override
	public String toString() {
		return "UniversityStudent [major = " + major + "]";
	}
	
	@Override
	void introduce() {
		System.out.println("안녕하세요. 저는 " + major + "전공하고 있는 " + getName() + "입니다.");
	}
}
