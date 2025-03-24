package ex07;

/*
 * T : 타입인자
 * T extends A -> T에게 전달되는 대상은 A인거나 A 자손만 전달 가능
 */
class Box<T extends A> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

class A{}
class B extends A{}
class C extends B{}

class D{}
class Person{}
class Car{}

public class 제네릭이해 {

	public static void main(String[] args) {
		
		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		Box<C> cBox = new Box<>();

		//Box<D> dBox = new Box<>();
		//Box<Person> pBox = new Box<>();
		//Box<Car> cBox = new Box<>();
		
		

	}

}









