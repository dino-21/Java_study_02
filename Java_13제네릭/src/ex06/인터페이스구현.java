package ex06;

interface Aable{};

class B implements Aable{};

class C {};
// extends 인터페이스	구현 제한
// 제네릭에선 extends 하나로 상속과 구현을 모두 표현한다

// T extends 클래스	T는 해당 클래스 또는 그 하위 타입
// T extends 인터페이스	T는 해당 인터페이스를 구현한 타입만 허용


class Box<T extends Aable> { // T 전달은 인터페이스 Aabl구현 클래스만 전달가능!!
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) { //public void setObj(A obj)
		this.obj = obj;
	}
}

public class 인터페이스구현 {

	public static void main(String[] args) {
		
		Box<B> bBox = new Box();
		
//		Box<Integer> ibox = new Box();
//		Box<String> sbox = new Box();
		
//		Box<C> cbox = new Box(); error
	}

}



















