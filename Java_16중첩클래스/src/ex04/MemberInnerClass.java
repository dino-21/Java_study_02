package ex04;

class Outer{
	
	private int num = 10;
	
	int get() {return num; }
	
	class Member{
		
		void add(int num) {
			Outer.this.num = num;
			
		}
		
		int get() { return num*2; }
	}
}

// 바깥 객체가 먼저 생성되어야 안의 내부클래스를 만들수 있음
public class MemberInnerClass {

	public static void main(String[] args) {
		
		//객체를 나눠서 생성
		Outer o1 = new Outer();
		System.out.println(o1.get());
		
		Outer.Member o1m1 = o1.new Member();
		int num =  o1m1.get();
		System.out.println(num);
		
		System.out.println("-------------");
		
		
		//바깥 객체와 내부 객체를 한 번에 생성
		Outer.Member o1m2 = new Outer().new Member();
		System.out.println(o1m2.get());
	}

}
