package ex05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{}

public class SetExam01 {

	public static void main(String[] args) {
		
		Set<Object> list = new HashSet<>();
		
		list.add("Robot");
		list.add("Box");
		list.add("Toy");
		list.add(10);
		list.add(new Person());
		
		for(Object str : list) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("------------------------------------");
		
		Iterator<Object> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		System.out.println();

	}

}
