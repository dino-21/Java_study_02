package ex08;

import ex01.Account;

public class SingletonExample {

	public static void main(String[] args) {

		Account ac = new Account();
		Account ac2 = new Account();
		System.out.println(ac == ac2);

		// Singleton 클래스는 getInstance() 메서드로만 인스턴스를 가져올 수 있음
		// 이 메서드는 항상 동일한 객체(하나만 존재)를 반환함
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1 == s2); // 동일한 객체
	}

}
