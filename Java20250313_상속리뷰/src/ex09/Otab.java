package ex09;

public class Otab extends Mobile{
	Otab(){}
	
	Otab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		setBatterySize(getBatterySize() - 12 * time);
	}
	
	@Override
	public void charge(int time) {
		setBatterySize(getBatterySize() + 8 * time);
		//충전을 통한 배터리 증가 구현
		//1분 충전시 배터리 10 증가
		//int size = getBatterySize();
		//size += time * 10;
		//setBatterySize(size)
	}
}
