package exam01;

public class Book {
	String title;  //제목
	String author;  //저자
	int price;  //가격
	
	Book(){}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	String getBookInfo() {
		return "[책이름: " + title + " 저자: " + author + " 가격: " + price + "] ";
	}
	
	
}
