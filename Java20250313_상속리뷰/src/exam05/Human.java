package exam05;

public class Human {
	String name;
	int age;
	int height;
	int weight;
	
	Human(){}
	Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	String printInformaiton() {
		return name + "\t" + age + "\t" + height + "\t" + weight;
	}
}

