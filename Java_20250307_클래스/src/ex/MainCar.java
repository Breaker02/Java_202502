package ex;


public class MainCar {

	public static void main(String[] args) {
		//Car car1 = new Car("포르쉐", "파나메라", 2025);
		
		Car car = new Car("기아", "K8", "2023");
		Car car2 = new Car("현대");
		Car car3 = new Car("기아", "K8");
		
		car.startEngine();
		car.displayInfo();
		
		car2.startEngine();
		car2.displayInfo();
		
		car3.startEngine();
		car3.displayInfo();

	}

}
