package ex07;

public class Main {

	public static void main(String[] args) {
		
		ClassC c = new ClassC(10,20,30);
		
		c.info(); // 10 20 30 출력
		
		func(new ClassA());
		System.out.println("===1");
		func(new ClassB());
		System.out.println("===2");
		func(new ClassC());
		System.out.println("===3");
		
		
	}
	
	static void func(ClassA a) {
		
//		ClassA a0 = new ClassA();
//		ClassA a1 = new ClassB();
//		ClassA a2 = new ClassC();
		System.out.println();
		//ClassB 또는 그 하위 클래스의 인스턴스
		if(a instanceof ClassB) {
			System.out.println("aaa");			
		}
	
	}

}
