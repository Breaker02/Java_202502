package ch01.ex03;

public class MainPerson {

	public static void main(String[] args) {
		Person person = new Person("설악산", 50);
		Person person2 = new Person("지리산", 80);
		
		//person = person2;
		
		System.out.println(person.displayInfo());
		
		System.out.println();
		Person p3 = new Person();
		
		System.out.println(p3.displayInfo());
		
		System.out.println();
		Person p4 = new Person("치악산");
		
		System.out.println(p4.displayInfo());
	}

}
