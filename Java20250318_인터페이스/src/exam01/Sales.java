package exam01;

public class Sales extends Employee implements Bonus {
	Sales(){}
	
	Sales(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary() * 0.13;
	}
	
	@Override
	public void incentive(int pay) {
		int salary = getSalary();
		salary += pay * 1.2;
		setSalary(salary);
	}
	
	public double getExtraPay() {
		//영업직원에게만 제공되는 추가수당을 리턴한다. salary의 3%금액 리턴 
		return getSalary() * 0.03;
	}
}
