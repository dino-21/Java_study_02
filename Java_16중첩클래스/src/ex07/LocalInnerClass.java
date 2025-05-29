package ex07;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	
	public Papers(String msg) { this.msg = msg; }
	
	public Printable getPrinter() {
				
		//선언+생성  tmp(변수이름) ---> 익명 클래스  new Printable() { ... } → 익명 클래스의 객체  
		// 중괄호 있으면 익명 클래스 {}
		// 변수에 담음
//		Printable tmp = new Printable() {
//			@Override
//			public void print() {
//				System.out.println(msg);
//			}	
//		};				
		
		
		//바로 리턴
		return new Printable() {
				@Override
				public void print() {
					System.out.println(msg);
				}	
			};
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Papers p = new Papers("전송할 메시지........");
		
		Printable tmp = p.getPrinter();
		tmp.print();
		
	}

}











