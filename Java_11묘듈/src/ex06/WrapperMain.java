package ex06;

public class WrapperMain {

	public static void main(String[] args) {
		
//		Integer num = new Integer(10);
		//박싱 (Boxing)	기본형(primitive)을 객체형(wrapper class)으로 변환
		Integer num = 10;  // new Integer(10) ==> 박싱
		
		
		//언박싱 (Unboxing)	객체형(wrapper class)을 기본형으로 변환
		int num2 = new Integer(20);  //int num2 = 20  => 언박싱

	}

}
