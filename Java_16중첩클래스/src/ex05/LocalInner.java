package ex05;


class LocalClass{
	
	private int localClass = 1;  //인스턴스 변수? 객체생성 될 때 
	
	public void func() {
	    // 지역 변수는 일반적으로 바꿀 수 있음.
	    // 단, 내부 클래스에서 사용하면 '사실상 final'이 되어야 해서 변경 불가.
		
		int localVar = 2;  //지역변수 ? 함수 호출시 --변경불가
		
//		localVar++;   // 내부 클래스에서 사용되므로 수정하면 컴파일 오류 발생
		class InnerClass{  //지역 클래스
			
			int innerVar = 3;  //인스턴스 변수? 객체 생성될 때
			
			public void print() {
				System.out.println(++localClass);
				System.out.println(localVar);
				System.out.println(++innerVar);
			}
		}
		
		InnerClass inner = new InnerClass();
		inner.print();
	}
}

public class LocalInner {

	public static void main(String[] args) {
		LocalClass lc = new LocalClass();		
		lc.func();
	}
}










