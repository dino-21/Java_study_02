package ex01;


class Apple{
	@Override
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	@Override
	public String toString() {
		return "I am an orange.";
	}
}

class AppleBox{
	private Apple ap;

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}	
}

class OrangeBox{
	private Orange op;

	public Orange getOp() {
		return op;
	}

	public void setOp(Orange op) {
		this.op = op;
	}	
}

public class FruitAndBox {
	//제네릭이 없으면 타입마다 전용 클래스를 만들어야 하는 불편함
	public static void main(String[] args) {
		
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setAp(new Apple());  // 사과 상자에 사과 넣기
		oBox.setOp(new Orange()); // 오렌지 상자에 오렌지 넣기
		
		Apple ap = aBox.getAp();  //사과박스(aBox)에서 사과 꺼내기
		Orange op =oBox.getOp();  //오렌지박스(oBox)에서 오렌지 꺼내기
		
		System.out.println(ap);
		System.out.println(op);
		
	}

}

















