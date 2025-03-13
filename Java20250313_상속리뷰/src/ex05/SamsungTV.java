package ex05;

public class SamsungTV extends TV {
	
	@Override
	void powerOn() {
		System.out.println("SamsungTV.");
		System.out.println("전원 ON");
	}
	void powerOff() {
		System.out.println("SamsungTV.");
		System.out.println("전원 OFF");
	}
	
	void volumeUp() {
		System.out.println("SamsungTV.");
		System.out.println("볼륨 UP");
	}
	void volumeDown() {
		System.out.println("SamsungTV.");
		System.out.println("볼륨 DOWN");
	}
}
