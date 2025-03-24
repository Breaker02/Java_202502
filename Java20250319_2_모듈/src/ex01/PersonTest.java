package ex01;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = name != null ? name.hashCode():0;
		//자바에서는 객체 해시를 생성할때 필드들의 해시를 혼합할 목적으로 주로 31 소수값을 곱해준다.(반드시는 아니다)
		result = 31 * result + age;
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("---------equals---------");
		Person o = (Person)obj;
		
		return this.age == o.age && this.name == o.name;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println(str1.equals(str2));
		
		Person p1 = new Person("홍길동", 10);
		Person p2 = new Person("박길동", 20);
		
		System.out.println(p1.equals(p2));
		
		Person p3 = new Person("홍길동", 10);
		Person p4 = new Person("홍길동", 10);
		
		System.out.println(p3.equals(p4));
		
		Person p5 = new Person("이천하", 50);
		Person p6 = new Person("삼천리", 40);
		
		System.out.println(p5.equals(p6));
		
	}
}