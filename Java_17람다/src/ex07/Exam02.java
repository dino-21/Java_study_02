package ex07;

import java.util.function.BiConsumer;

interface PrintVariable{
	void printVar(String name, int i);
}

public class Exam02 {

	public static void main(String[] args) {

		PrintVariable p = ( name, i) ->System.out.println(name+"="+i);
				
		
		p.printVar("까미", 20);
		
		System.out.println("----------------");
		
		//자바 내장 함수형 인터페이스 BiConsumer 를 활용
		// BiConsumer<T, U>는 두 개의 인자를 받고 값을 리턴하지 않음 (void)
		BiConsumer<String, Integer> bc = 
			(name, i) ->System.out.println(name+"="+i);
			
		bc.accept("로이", 13);
		
	}

}
