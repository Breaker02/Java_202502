package ex010;

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
	
	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
	//                              상한 제한   -> 목적 : 읽지 전용 쓰기 금지 
	public static void peekBox1(Box<? extends B > box) {
//		System.out.println(box);
		box.getObj();
//		box.setObj(box);
	}
 
	//                                 하한 제한 -> 목적 : 쓰기 전용 읽기 금지
	public static void peekBox2(Box<? super C> box) {
//		System.out.println(box);
		box.getObj();
//		box.setObj();
	}
}

public class WildcardExam01 {

	public static void main(String[] args) {
		Box<B> box = new Box<>();
//		box.setObj(new B());
		
		Unboxer.peekBox(box);
		
		
	}

}










