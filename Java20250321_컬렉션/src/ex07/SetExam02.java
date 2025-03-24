package ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return num + "";
	}
	@Override
	public int hashCode() {
		System.out.println("-hashCode-");
		return num%5;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("-equals-");
		Num number = (Num)obj;
		
		return this.num == number.num;
	}
	
	
}

public class SetExam02 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		
		
//		set.add(new Num(1234));
//		set.add(new Num(1357));
//		set.add(new Num(1395));
//		set.add(new Num(1234));
//		set.add(new Num(1357));
		
		for(String n : set) {
			System.out.println(n);
		}
		
		System.out.println();
		Set<Integer> iset = new TreeSet<>();
		
		iset.add(40);
		iset.add(30);
		iset.add(50);
		iset.add(10);
		iset.add(20);
		iset.add(40);
		iset.add(30);
		
		
		for(int n : iset) {
			System.out.println(n);
		}
		
	}

}
