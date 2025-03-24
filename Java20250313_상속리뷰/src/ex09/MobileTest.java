package ex09;

public class MobileTest {

	public static void main(String[] args) {
//		Mobile[] mobiles = new Mobile[2];
//		
//		mobiles[0] = new Ltab("Ltab", 500, "ABC-01");
//		mobiles[1] = new Otab("Otab", 1000, "XYZ-20");
		
		Mobile ltab = new Ltab("Ltab", 500, "ABC-01");
		Mobile otab = new Otab("Otab", 1000, "XYZ-20");
		
		printTitle();
		//기본 출력
		printMobile(ltab);
		printMobile(otab);
		
		ltab.charge(10);
		otab.charge(10);
		
		//10분 충전
		System.out.println();
		System.out.println("[10분 충전]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);
		
		//5분 통화
		ltab.operate(5);
		otab.operate(5);
		System.out.println();
		System.out.println("[5분 통화]");
		printTitle();
		printMobile(ltab);
		printMobile(otab);

	}

	public static void printMobile(Mobile mobile) {
		System.out.println(mobile.getMobileName() + "\t\t" +
						   mobile.getBatterySize() + "\t\t " +
						   mobile.getOsType());
	}
	
	public static void printTitle() {
		System.out.println("Mobile\t\tBattery\t\t OS");
		System.out.println("---------------------------------------");
	}
}
