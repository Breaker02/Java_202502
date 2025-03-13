package exam02;

public class ProductTest {
	public static void main(String[] args) {
		Product[] pr = new Product[5];
	
		pr[0] = new Product();
		pr[1] = new Product("스마트폰", 20, 800000);
		pr[2] = new Product("태블릿", 15, 600000);
		pr[3] = new Product("모니터", 12, 300000);
		pr[4] = new Product("헤드폰", 30, 200000);
		  
		for(int i = 0; i <pr.length; i++) {
				System.out.println(pr[i]);
			}
	  }
}

