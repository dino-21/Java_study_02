package ex02;

public class MemberInitMain {

	public static void main(String[] args) {
		
		MemberInit member1 = new MemberInit();
		member1.initMember("user1", 15, 90);
		System.out.println(member1);
		
		MemberInit member2 = new MemberInit();
		member2.initMember("user2", 16, 80);	
		System.out.println(member2);
		
	}

}
