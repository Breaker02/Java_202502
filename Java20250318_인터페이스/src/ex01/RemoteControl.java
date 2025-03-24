package ex01;

public interface RemoteControl {
	static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/*
	 * interface 상수
	 * 멤버변수 생성 불가
	 * 정적변수만 생성 가능
	 */
	
	//추상 메소드
	public void turnOn();
	
	//추가 
	void turnOff();
	void setVolume(int volume);
	
	//디프로트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("리모컨 건전지 교체");
	}
}
