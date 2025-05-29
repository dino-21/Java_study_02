package ex07;

import java.util.function.BiFunction;
//메서드가 하나만 존재해야 함을 보장하는 어노테이션
@FunctionalInterface 
interface MaxA{
	int max(int a, int b);
}

public class Exam01 {

	public static void main(String[] args) {
		
		
		/*
		 *   람다.....
			 매개변수 자료형 삭제가능
			 반환 타입 있는 경우 -> {} 안에는 return 기입
			 반환 타입 있는 경우 -> {} 없으면 return 생략		
		 */
		MaxA result = (a, b) ->  a > b ? a : b;
		
		//메소드참조, 정적 메서드 Integer.max(int, int) 를 직접 참조
		MaxA result2 = Integer::max;
			
				
		System.out.println(result.max(100, 300));
		
		System.out.println(result2.max(5, 3));
		System.out.println("-------------------");
		
		
		//자바 내장 함수형 인터페이스 중 하나, 제네릭 구조: BiFunction<T, U, R> /  T, U는 입력 타입/ R은 반환 타입
		BiFunction<Integer, Integer, Integer> bf = 
				(a, b) ->  a > b ? a : b;
				
		System.out.println(bf.apply(5, 7));
	}

}










