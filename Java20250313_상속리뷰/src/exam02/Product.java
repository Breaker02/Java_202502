package exam02;

import java.text.DecimalFormat;

public class Product {
	String name;
	int balance;
	int price;
	
	Product(){
		name = "듀크인형";
		balance = 5;
		price = 10000;
	}
	Product(String name, int balance, int price){
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###"); // 가격에 천단위 쉼표 추가
		return "[상품명: " + name + " 재고량: " + balance + " 가격: " + df.format(price) + "원] ";
	}
}
