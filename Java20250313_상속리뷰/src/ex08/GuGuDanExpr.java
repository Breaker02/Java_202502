package ex08;

public class GuGuDanExpr extends Multiplication {
	
	GuGuDanExpr() {}
	
	GuGuDanExpr(int dan){
		super(dan);
	}
	
	GuGuDanExpr(int dan, int number){
		super(dan, number);
	}
	
	public static void printAll() {
		for (int n = 1; n <= 9; n++) {
			for(int m = 2; m <= 9; m++) {
				System.out.println(n + " * " + m + " = " + n*m + "\t");
			}
			System.out.println();
		}
	
	}
}
