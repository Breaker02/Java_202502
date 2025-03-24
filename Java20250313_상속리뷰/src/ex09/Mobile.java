package ex09;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	Mobile(){}
	
	Mobile(String mobileName, int batterySize, String osType){
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public String getMobileName() {
		return mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	
	public void setOsType(String osType) {
		this.osType = osType;
	}
	/*
	 * 추상메소드 => Mobile을 상속하는 객체는 반드시 추상 메소드를 재정의해서 사용해라!
	 * 추상클래스 => 객채 생성 불가
	 */
	public abstract void operate(int time);
	public abstract void charge(int time);
}
