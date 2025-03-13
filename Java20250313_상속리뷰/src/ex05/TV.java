package ex05;

/*
 * 클래스 내부에 추상클래스 1개 이상
 * 존재하면 그 클래스는 추상클래스이다
 */

public abstract class TV {
	/*
	 * 메소드 4개
	 * 전원 on, off
	 * 사운드 up, down
	 */
	boolean power;
	int volume;
	
	TV(){
		power = false;
		volume = 0;
	}
	
	//추상메소드 -> {}가 없다

	abstract void powerOn();.
0	abstract void powerOff();
	abstract void volumeUp();
	abstract void volumeDown();
}
