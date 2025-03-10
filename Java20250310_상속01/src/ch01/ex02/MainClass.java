package ch01.ex02;

class GrandParent {
	private String 할아버지이름;	
	
	String get할아버지이름(){
		return 할아버지이름;
	}
	
	GrandParent(){}
	GrandParent(String 할아버지이름){
		this.할아버지이름 = 할아버지이름;
	}
}

class Parent extends GrandParent{
	private int 아버지나이;
	
	int get아버지나이() {
		return 아버지나이;
	}
	Parent(){}
	Parent(String 할어버지이름, int 아버지나이){
		super(할어버지이름);   // 상위클래스 생성자 호출(인자값 21개 받게 설정)
		this.아버지나이 = 아버지나이;
	}
}

final class Child extends Parent{
	String 나의취미;
	Child(){}
	Child(String 할아버지이름, int 아버지나이, String 나의취미){
		super(할아버지이름, 아버지나이);  // 상위클래스 생성자 호출(인자값 2개 받게 설정)
		this.나의취미 = 나의취미; 
	}
	
	void displayInfo() {
		System.out.println("할아버지 성함: " + get할아버지이름());
		System.out.println("아버지 연세: " + get아버지나이());
		System.out.println("나의 취미: " + 나의취미);
	} 
}

public class MainClass {

	public static void main(String[] args) {
		Child child = new Child("김철수", 50, "운동");
		
		/*
		 * 할아버지 성함은 김철수
		 * 아버지 연세는 50
		 * 나의 취미는 게임
		 */
		
		child.displayInfo();
		
		
	}

}
