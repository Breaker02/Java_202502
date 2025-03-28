package ex11;

import java.util.Iterator;
import java.util.Stack;

class Coin{
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Coin(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value + "";
	}
}

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));
		
		System.out.println(coinBox.peek());
		
		System.out.println();
		
		Iterator<Coin> itr = coinBox.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
