package ex16;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;

public class Queue01 {

	public static void main(String[] args) {
		//인터페이스 ,             구현클래스
		List<Integer> al = new ArrayList<Integer>();  //배열 기반 리스트, 빠른 조회
		List<Integer> ll = new LinkedList<Integer>(); //연결 리스트 기반, 삽입/삭제 빠름
		Set<Integer> hs = new HashSet<Integer>();   //순서 없음, 중복 제거
		Set<Integer> ts = new TreeSet<Integer>();  //자동 정렬됨 (오름차순), 중복 제거
		List<Integer> ck = new Stack<Integer>();  //후입선출(LIFO) 자료구조
		
		/*
		 * Queue는 인터페이스이다. 따라서 객체 생성을 할 수 없다
		 * Queue를 사용하기 위해서는 Queue를 구현하든가, 아니면 구현된 객체를 사용하면된다.
		 */
		
		
		/*
		 * 큐(Queue)는 선입선출(First-In-First-Out, FIFO) 구조
		 * 먼저 들어온 데이터가 먼저 나간다. 줄 서기처럼 동작: 먼저 넣은 것부터 꺼낸다.
		 */
		Queue<Integer> qu = new  ArrayDeque<Integer>();
		
		qu.offer(10); // offer 추가
		qu.offer(20);
		qu.offer(30);
		
		System.out.println(qu.poll());  // 꺼냄 (앞에서제거)
		System.out.println(qu.poll());
		System.out.println(qu.poll());
	}
}



















