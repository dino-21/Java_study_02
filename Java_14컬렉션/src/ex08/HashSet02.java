package ex08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class HashSet02 {

	public static void main(String[] args) {
		//출력 => Iterator
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);		
		
		Iterator<Integer> itr = set.iterator();  //반복자 획득
		
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();
		System.out.println("----------------------");
		
		//itr에는 HashSet 안에 있는 값들을 하나씩 꺼낼 수 있는 도구
		itr = set.iterator();  //반복자 획득, 
		 
		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
	}

}
