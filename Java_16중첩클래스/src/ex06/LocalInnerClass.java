package ex06;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	
	public Papers(String msg) { this.msg = msg; }
	
	public Printable getPrinter() {
		
		//선언, 로컬 내부 클래스
		class Printer implements Printable{ //Printer는 getPrinter() 안에서만 쓰이므로 외부 노출 없음, 캡슐화 (지역전용, 외부에서 보이지 않음)

			@Override
			public void print() {
				System.out.println(msg);
			}			
		}
		
		//생성
		Printable tmp = new Printer();
		
		return tmp;
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		
		Papers p = new Papers("전송할 메시지........");
		
		Printable pa = p.getPrinter();
		pa.print();
		
	}

}











