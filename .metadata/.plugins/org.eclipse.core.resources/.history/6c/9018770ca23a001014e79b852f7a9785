package ex03_set;

import java.util.HashSet;
import java.util.Set;


class Person{
	private int age;
	
	public Person(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
//		return age % 3;
		return Integer.hashCode(age);
	}
	
	@Override
	public boolean equals(Object obj) {
//		Person p = (Person)obj;
		return  this.age == ((Person)obj).age;
	}
}
public class set03 {

	public static void main(String[] args) {
		
		Set<Person> set = new HashSet<>();
		
		set.add(new Person(10));
		set.add(new Person(20));
		set.add(new Person(10));
		set.add(new Person(20));
		set.add(new Person(50));
		
		for(Person person : set)
			System.out.println(person);
	}

}
