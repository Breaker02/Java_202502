package ex10;

class Box<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return (String)obj;
	}
}

class A{}
class B extends A{}
class C extends B{}
class D {}

class Unboxer{
	public static <T> T openBox(Box<T> box) {
		return box.getObj();
	}
	//                              상한 제한    
	public static void peekBox(Box<? extends B > box) {
//		System.out.println(box);
		box.setObj(box);
	}
 
	//                                 하한 제한
	public static void peekBox2(Box<? super C> box) {
		box.getObj(box);
	}
}

public class WildcardExam01 {

	public static void main(String[] args) {
		Box<B> box = new Box<>();
		box.setObj(new B());
		
		Unboxer.peekBox(box);
		
		
	}

}










