package ex02;

public class MemberInit {
	String name;
	int age;
	int grade;
	
	void initMember(String name, int age, int grade) {
		 this.name = name;
		 this.age = age;
		 this.grade = grade;
	}

	@Override
	public String toString() {
		return "MemberInit [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
}
