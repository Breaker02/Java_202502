package exam01;

public class Secretary extends Employee implements Bonus {
	
	Secretary(){}
	
	Secretary(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	
	@Override
	public double tax() {
		return getSalary() * 0.1;
	}
	
	@Override
	public void incentive(int pay) {
		
		/*int salary = getSalary();
		salary += pay * 0.8;
		setSalary(salary);*/
		
		int salary = (int) (getSalary() + pay * 0.8);
		setSalary(salary);

	}
	
}
