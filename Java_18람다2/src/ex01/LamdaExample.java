package ex01;

public class LamdaExample {

	public static void main(String[] args) {

//		// MyFunctionClass를 이용한 메서드 호출
//		MyFunction func1 = new MyFunctionClass();
//
//		System.out.println(func1.myMethod("강원도"));

		// 익명 클래스를 사용하여 메서드 구현
		MyFunction func2 = new MyFunctionClass() {
			public int myMethod(String s) {
				return s.length();
			}
		};
		
		MyFunction func3 = (s) ->s.length();
		
		
		
		System.out.println(func2.myMethod("아름다운 가을"));
		
//
//		// 람다 표현식을 이용한 간결한 메서드 구현
//		MyFunction func3 = (s) -> s.length();
//		System.out.println(func3.myMethod("동해물과 백두산이 마르고"));
	}

}
