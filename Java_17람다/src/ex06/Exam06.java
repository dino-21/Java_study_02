package ex06;
//int[]를 리턴하는 추상 메서드 하나를 가진 인터페이스
interface EmptyArrA {
	int[] emptyArr();
}

public class Exam06 {

	public static void main(String[] args) {

		EmptyArrA a = new EmptyArrA() {
			
			@Override
			public int[] emptyArr() {
				return new int[] {};
			}
		};
		
		int[] ar = a.emptyArr();
	}
}
