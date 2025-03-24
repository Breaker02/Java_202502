package ex01;

/*
 * A < B < C
 */

public class RemoteTest {

	public static void main(String[] args) {

		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
//		rc.turnOff();
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		//라디오 객체 생성하고 인터페이스 변수 대입
		rc = new Radio();
		rc.turnOn();
		rc.setVolume(5);
//		rc.turnOff();
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
	}

}
