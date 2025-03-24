package ex06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import lombok.AllArgsConstructor;


class Member{
	String name;
	int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
                
        Member other = (Member) obj;
        return age == other.age && name.equals(other.name);
    }
}

public class SetExam01 {

	public static void main(String[] args) {
		
		Set<Member> set = new HashSet();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 21));
		
		for(Member m : set)
			System.out.println(m);
	}

}