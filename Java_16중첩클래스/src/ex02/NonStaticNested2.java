package ex02;

/* 데이터(문자열)를 객체로 감싸는 연습 (캡슐화)
*SRP (Single Responsibility Principle), 단일 책임 원칙
* 한 클래스는 하나의 책임만 가져야 한다!
* Network와 SendMessage의 역할 분리 연습
* */

// 전송할 메시지를 표현하는 역할
class SendMessage{
	private String msg;
	
	public SendMessage(String msg) { this.msg = msg; }
	
	public String getMsg() {
		return msg;
	}
}

//메시지를 전송하는 역할
class Network{
	
	public void message(String content) {
		
		SendMessage msg = new SendMessage(content);
		System.out.println(msg.getMsg());
	}
}

public class NonStaticNested2 {

	public static void main(String[] args) {
		Network net = new Network();
		
		net.message("전송할 데이타 입니다.");		
	}	
}








