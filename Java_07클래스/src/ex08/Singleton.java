package ex08;

//싱글톤(Singleton) 패턴: 클래스의 인스턴스를 오직 하나만 생성하도록 제한하는 설계 패턴
public class Singleton {
	// 클래스가 로딩될 때 단 한 번 생성되는 정적(private static) 인스턴스
	private static Singleton singleton = new Singleton();

	// 외부에서 new Singleton()으로 객체 생성을 못 하도록 생성자 private 처리
	private Singleton() {
	}

	// 외부에서 유일한 인스턴스에 접근할 수 있는 public 정적 메서드 제공
	public static Singleton getInstance() {
		return singleton;
	}
}
