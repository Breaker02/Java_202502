<<<<<<< HEAD
package ch02.sec1;

public class VariableScopeExample {
	public static void main(String[] args) {
		int num = 10;
		{
			int n1 = 20;
			num = num+1;
			System.out.println(num);
			
			System.out.println(n1);
		}
		System.out.println(num);
		//System.out.println(n1);
	}
	static void func() {
		//System.out.println(num);
	}
}
=======
package ch02.sec1;

public class VariableScopeExample {
	public static void main(String[] args) {
		int num = 10;
		{
			int n1 = 20;
			num = num+1;
			System.out.println(num);
			
			System.out.println(n1);
		}
		System.out.println(num);
		//System.out.println(n1);
	}
	static void func() {
		//System.out.println(num);
	}
}
>>>>>>> 64f51575e85455c2eca163757bb1ebe3702fd364
