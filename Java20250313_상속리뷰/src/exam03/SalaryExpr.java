package exam03;

public class SalaryExpr {
	int bonus;
	
	SalaryExpr(){
		this.bonus = 0;
	}
	
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}

	public int getSalary(int grade) {
		switch(grade) {
		case 1:
			bonus += 100;
			break;
		case 2:
			bonus += 90;
			break;
		case 3:
			bonus += 80;
			break;
		case 4:
			bonus += 70;
			break;
		}
		return bonus;
	}
}
