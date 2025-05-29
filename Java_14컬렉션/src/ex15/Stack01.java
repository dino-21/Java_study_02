package ex15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


public class Stack01 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		/*
		* 스택은 컵구조 값이 차례대로 들어가고 마지막에 들어간게 처음에 나옴
		* Stack은 Vector를 상속받기 때문에 add(), get(), remove() 같은 List 메서드도 함께 사용 가능
		* push()는 스택 전용 메서드로, LIFO 구조에 맞는 명확한 의미
		* add()는 리스트 용 메서드로서, Stack을 리스트처럼 쓸 수는 있지만 추천되지 않음, push가 바람직
		*/
		stack.push(10); // [10]
		stack.push(20); // [10,20]
		stack.push(30);  //[10,20,30]
		stack.add(60);   //[10,20,30,60]
		stack.add(1, 70); // [10,70,20,30,60]
		stack.push(40);  //[10,70,20,30,60,40]
		stack.push(50); //[10,70,20,30,60,40,50]
		
		
	
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());  //peek()는 제거하지 않고 보기만 함
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		System.out.printf("peek:%d %d\n",stack.peek(), stack.pop());
		
		// for 루프 안에서 스택의 크기를 고정하지 않고, 루프가 반복될 때마다 stack.size()가 변경되기 때문에
		/*System.out.println(stack.size());
		for(int i=0; i<stack.size(); i++) {			
			System.out.printf("peek:%d, %d\n",stack.peek(), stack.pop());
		}*/

               
		while (!stack.isEmpty()) {  // 스택이 비어 있지 않은 동안
                        System.out.printf("peek:%d, %d\n", stack.peek(), stack.pop());
                }

        System.out.println("Final size: " + stack.size());  // 마지막에 사이즈 확인
			
		
//		Iterator<Person> itr = set.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
	}
}



















