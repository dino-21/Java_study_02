package ex07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class HashSet01 {

	public static void main(String[] args) {
		
		//출력 => Iterator
		//HashSet은 순서가 없기 때문에 바로 for문 못 돌림
		Set<String> set = new HashSet<String>();
		
		set.add("kor");
		set.add("eng");
		set.add("math");
		set.add("com");		
		
		Iterator<String> itr = set.iterator();  //반복자 획득
		
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("----------------------");
		
		itr = set.iterator();  //반복자 획득
		
		//다음에 데이터가 있으면 true, 없으면 false를 반환
		while(itr.hasNext()) //itr.hasNext(),  반환 타입: boolean
			System.out.print(itr.next() + " ");
	}

}


/*
 * HashSet = 책
 * Iterator = 책갈피
 * itr = 책갈피를 들고 있는 손
 * 
 * itr.hasNext() = 책갈피 다음에 읽을 페이지가 있니?
 * itr.next() = 책갈피 다음 페이지를 꺼내줘 (그리고 책갈피 한 장 넘김)
 */