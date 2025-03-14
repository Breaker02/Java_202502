package exam05;

public class Student extends Human{
	String number;
	String major;
	
	Student(){}
	Student(String name, int age, int height, int weight, String number, String major){
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	@Override
	public String printInformaiton() {
		return name + "\t" + age + "\t" + height + "\t" + weight + "\t" + number + "\t" + major;
	}
}
