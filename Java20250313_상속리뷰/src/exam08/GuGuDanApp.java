package exam08;

public class GuGuDanApp {

	public static void main(String[] args) {
		//1~ 20 난수
		int dan = (int)(Math.random()*20)+1;
		int number = (int)(Math.random()*20)+1;
		
		System.out.println(dan);
		System.out.println(number);
		
/*
 * dan 과 number 이 모두 1~9 사이이면 dan*number 의 구구단을 출력한다. 
   GuGuDanExpr 객체를 생성(생성자를 통해서 dan과 number에 대한 데이터를 전달하여 초기화한다.)하고 
   printPart() 를 호출한다. 단이 3, number가 4로 추출된다면 3 * 4 = 12 를 출력한다.
 */
		
		//1번 문제......
		if(dan <= 9 && number <= 9) {
			GuGuDanExpr expr = new GuGuDanExpr(dan, number);
			expr.printPart();
			
		}
		else if((dan <= 9) && number >= 10) {
			GuGuDanExpr expr = new GuGuDanExpr(dan);
			expr.printPart();
		} 
		else if(dan >= 10) {
			GuGuDanExpr.printAll();
		}
	}
	 

}
