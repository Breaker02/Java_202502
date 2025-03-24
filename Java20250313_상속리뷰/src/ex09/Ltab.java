package ex09;

public class Ltab extends Mobile {
	Ltab(){}
	
	Ltab(String mobileName, int batterySize, String osType){
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
		for(int i = 0; i < time; i++) {
			setBatterySize(getBatterySize() - 10);
		}
	}
	
	@Override
	public void charge(int time) {
		for(int i = 0; i < time; i++) {
			setBatterySize(getBatterySize() + 10);
		}
	}
}
