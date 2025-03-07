package ch02.sec06.exam02;

public class Car {
	private String company = "현대자동차";
	private String model;
	private String color;
	private int maxSpeed;
	
	String getCompany() {
		return company;
	}
	String getModel() {
		return model;
	}
	String getColor() {
		return color;
	}
	int getMaxSpeed() {
		return maxSpeed;
	}
	
	void setCompany(String company) {
		this.company = company;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	

	Car(){}
	
	public Car(String model){
		this.model = model;
	}
	public Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	public Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
