package ex03_set;

import java.util.HashSet;
import java.util.Set;

public class set02 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("kor");
		set.add("eng");
		set.add("math");
		set.add("com");
		set.add("eng");
		
		for(String str : set)
			System.out.println(str);
	}

}
