package ch06.sec07.exam06;

public class Car {
    private String brand;
    private String model;
    private String year;

    // 기본 생성자
    Car() {
        this("기아", "K8", "2023");
    }

    // 브랜드만 설정하는 생성자
    Car(String brand) {
        this(brand, "그랜저", "2024");
    }

    // 브랜드와 모델을 설정하는 생성자
    Car(String brand, String model) {
        this(brand, model, "2025");
    }

    // 모든 값을 초기화하는 생성자
    Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter 메서드
    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    String getYear() {
        return year;
    }

    // Setter 메서드
    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(String year) {
        this.year = year;
    }

    // 엔진 시작 메서드
    public void startEngine() {
        System.out.println("[" + brand + "][" + model + "]의 엔진이 시작되었습니다!");
    }

    // 자동차 정보 출력 메서드
    public void displayInfo() {
        System.out.println("자동차 정보: [" + year + "]년식 [" + brand + "] [" + model + "]");
    }
}
