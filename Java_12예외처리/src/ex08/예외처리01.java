package ex08;

import java.util.Scanner;

public class 예외처리01 {
    // 예외가 발생하면 JVM(자바 실행기)에게 던질게,  예외가 발생하면 프로그램이 바로 종료됨
	// catch 블록이 없기 때문에 예외는 처리되지 않음
	public static void main(String[] args) throws Exception {
		
		
		func(10,0);
		
		System.out.println("프로그램 종료!!");
	}
	
	static void func(int n1, int n2) throws Exception{
		//함수에서 예외 발생하면 내부에서 처리하지 않음!
		
		int result = 0;
		
		result =  n1/n2;
		
		System.out.println("result = " +result);
	}

}
