package exam01;

import exam02.Product;

public class BookTest {

	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		
		books[0] = new Book("자바의 정석", "남궁성", 30000);
		books[1] = new Book("이것이 자바다", "신용권", 35000);
		books[2] = new Book("Effective Java", "Joshua Bloch", 45000);
		books[3] = new Book("클린 코드", "Robert C. Martin", 40000);
		books[4] = new Book("객체지향의 사실과 오해", "조영호", 25000);
	
		for(int i = 0; i <books.length; i++) {
			System.out.println(books[i].getBookInfo());
		}
	}

}
