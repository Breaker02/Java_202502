package ex02;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExam01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		list.add(0, "Robot");
		
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println();
		System.out.println("------------------------------------");
		
		for(String str : list)
			System.out.println(str);
		System.out.println();
		Iterator<String> itr = list.iterator();
		System.out.println();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		System.out.println();
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next() + "\t");
		}
		
		System.out.println();
		list.remove(0);
		list.remove("Box");
		list.remove("Toy");
		System.out.println();
		for(String str : list)
			System.out.println(str);
		System.out.println();
		
	}

}
