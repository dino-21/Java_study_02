package test2;

class A{
	void funcA() {
		System.out.println("AAA");
	}
	void funcB() {
		System.out.println("A");
	}
}

class B extends A{
	void funcB() {
		System.out.println("B");
	}
		
}
public class Main {

	public static void main(String[] args) {
		//메서드는 객체의 실제 타입(B) 기준으로 실행됨
		//오버라이딩된 메서드는 실제 객체 기준으로 실행
		A a = new B();
		a.funcB();
	}

}
