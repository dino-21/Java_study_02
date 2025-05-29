package ex07;

import java.util.Scanner;

import ex06.MathArrayUtils;
//final로 선언된 클래스로, 상속이 불가능
//주로 상수나 기능을 고정시킨 클래스를 만들 때 사용
public final class  FinalExam {
// MAX는 한 번만 초기화 가능한 상수 변수
	private final int MAX;
	
	FinalExam(int n){
		MAX = n;
	}
	
	public static void main(String[] args) {
		
		final double PI = 3.14159;   //상수	
		
		MathArrayUtils mUtil = new MathArrayUtils();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	//final 키워드를 메서드에 붙이면 
	// 이 메서드는 자식 클래스에서 오버라이딩(재정의)할 수 없다는 의미
	private final void func() {
		
	}

}
