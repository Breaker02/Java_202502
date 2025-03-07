package ch02.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.getCompany());
		
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println(car2.getCompany());
		System.out.println(car2.getModel());
		
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println(car3.getCompany());
		System.out.println(car3.getModel());
		System.out.println(car3.getColor());
		
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println(car4.getCompany());
		System.out.println(car4.getModel());
		System.out.println(car4.getColor());
		System.out.println(car4.getMaxSpeed());
		
		System.out.println();
		
		car2.setCompany("기아자동차");
		car3.setColor("파랑");
		car4.setMaxSpeed(256);
		System.out.println(car2.getCompany());
		
		System.out.println(car3.getColor());

		System.out.println(car4.getMaxSpeed());
		
		

	}

}
