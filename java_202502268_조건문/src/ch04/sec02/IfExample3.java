package ch04.sec02;

public class IfExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String result = (korScore >= 80)? "상" : (korScore >= 60)? "중" : "하";
		
		int korScore = 65;
		
		if(korScore >= 80) {
			System.out.println("상");
		}
		else {
			if(korScore >= 60) {
				System.out.println("중");
			}
			else {
				System.out.println("하");
			}
		}
		System.out.println("종료");
	}
}
