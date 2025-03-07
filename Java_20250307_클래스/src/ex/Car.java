package ex;

public class Car {
	private String brand;
	private String model;
	private String year;
	
	String getBrand() {
		return brand;
	}
	String getModel() {
		return model;
	}
	String getYear() {
		return year;
	}
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	
	void setYear(String year) {
		this.year = year;
	}
	
	Car(){
		brand = "기아";
		model = "K8";
		year = "2024";
	}
	
	Car(String brand){
		this.brand = brand;
		model = "그랜저";
		year = "2024";
	}
	
	Car(String brand, String model){
		this.brand = brand;
		this.model = model;
		year = "2024";
	}
	
	Car(String brand, String model, String string){
		this.brand = brand;
		this.model = model;
		this.year = string;
	}
	
	public void startEngine() {
		System.out.println("[" + brand + "][" + model + "]의 엔진이 시작되었습니다!");
	}
	
	public void displayInfo() {
		System.out.println( "자동차 정보: [" + year + "]년식 [" + brand + "] [" + model + "]");
	}
}
