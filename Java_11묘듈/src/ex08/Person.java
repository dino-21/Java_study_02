package ex08;

import java.util.Objects;
/* 
*  사용자가 equals()를 재정의한다는 건,
*  내가 만든 객체가 무엇을 기준으로 같다고 볼지를 직접 정하는 것
*/
public class Person implements Comparable<Person> {
    String name;

    public Person(String name) {
        this.name = name;
    }

    // 동등성 판단
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                    // 동일 참조 비교
        if (obj == null || getClass() != obj.getClass()) return false;  // null & 클래스 타입 비교
        Person other = (Person) obj;
        return Objects.equals(this.name, other.name);    // name 값 비교
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);  // equals()를 오버라이드하면 hashCode()도 같이!
    }

    // 크기 비교 (이름 기준 사전순 정렬)
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}
