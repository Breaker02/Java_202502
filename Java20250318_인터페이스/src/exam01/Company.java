package exam01;

public class Company {

	public static void main(String[] args) {
		
		/*Employee[] emp = new Employee[2];
		emp[0] = new Secretary("Duke", 1, "Secretary", 800);
		emp[1] = new Sales("Tuxi", 2, "Sales", 1200);*/
		
		// Employee 배열에 객체들을 생성하여 저장한다. 
		Employee[] emp = {
				new Secretary("Duke", 1, "Secretary", 800),
				new Sales("Tuxi", 2, "Sales", 1200)
		};
        // printEmployee()  메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다. 
        // 이 때는 세금을 출력하지 않는다. 
		System.out.println("name\t\tdepartment\t\tsalary\t\textra pay");
		System.out.println("--------------------------------------------------------------------");
		Company.printEmployee(emp, false);
        // 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은 다르다.  
		
        for(Employee e : emp) {
        	if(e instanceof Bonus) {
        		((Bonus)e).incentive(100);
        	}
        }
		
        // printEmployee()  메서드를 호출하여 Employee 배열의 객체들 정보와 세금을 출력한다
		System.out.printf("\n\n");
		System.out.println("[인센티브 100 지급]");
		System.out.println("name\t\tdepartment\t\tsalary\t\ttax\t\textra pay");
		System.out.println("----------------------------------------------------------------------------------");
		Company.printEmployee(emp, true);
	}
	
	public static void printEmployee(Employee[] emp, boolean isTax) { 
		 // 객체의 정보를 출력한다.(실행 결과를 참조) 
		 // isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다. 
		 /*for (Employee e : emp) {
			System.out.print(e.getName() + "\t\t" + 
							 e.getDepartment() + "\t\t" +
					 		 e.getSalary() + "\t\t");
			if (e instanceof Sales) {
		        if (isTax) {
		            System.out.println(e.tax() + "\t\t");
		        }
	            System.out.println(((Sales) e).getExtraPay());
	        }
			System.out.println();*/
		
		//for(int i = 0; i < emp.length; i++)
		for (Employee e : emp) {
            System.out.printf("%-16s%-10s%18d", e.getName(), e.getDepartment(), e.getSalary());
            if (isTax) {
                System.out.printf("%17.1f", e.tax());
            } else {
            	
            }
            // Sales 객체라면 getExtraPay() 추가 출력
            if (e instanceof Sales) {
                System.out.printf("%15.1f", ((Sales) e).getExtraPay());
            } 
            // 세금 출력 여부 확인
            System.out.println();
        }
    }

}
